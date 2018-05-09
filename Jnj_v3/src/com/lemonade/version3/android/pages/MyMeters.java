package com.lemonade.version3.android.pages;

import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

public class MyMeters extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "otr.mymeterspage.title.lbl")
	private QAFWebElement otrMymeterspageTitleLbl;

	@FindBy(locator = "otr.mymeterspage.TimeChange.lbl")
	private QAFWebElement otrMymeterspageTimeChangeLbl;

	@FindBy(locator = "otr.mymeterspage.timechangemessage.txt")
	private QAFWebElement otrMymeterspageTimechangemessageTxt;

	@FindBy(locator = "otr.mymeterspage.TimeChange.switch")
	private QAFWebElement otrMymeterspageTimeChangeSwitch;

	@FindBy(locator = "otr.mymeterspage.pairanotherdevice.txt")
	private QAFWebElement otrMymeterspagePairanotherdeviceTxt;

	@FindBy(locator = "otr.mymeterspage.pairanotherdeviceadd.btn")
	private QAFWebElement otrMymeterspagePairanotherdeviceaddBtn;

	public QAFWebElement getotrMymeterspagePairanotherdeviceaddBtn() {
		return otrMymeterspagePairanotherdeviceaddBtn;
	}

	public QAFWebElement getotrMymeterspageTitleLbl() {
		return otrMymeterspageTitleLbl;
	}

	public QAFWebElement getotrMymeterspageTimeChangeLbl() {
		return otrMymeterspageTimeChangeLbl;
	}

	public QAFWebElement getotrMymeterspageTimechangemessageTxt() {
		return otrMymeterspageTimechangemessageTxt;
	}

	public QAFWebElement getotrMymeterspageTimeChangeSwitch() {
		return otrMymeterspageTimeChangeSwitch;
	}

	public QAFWebElement getotrMymeterspagePairanotherdeviceTxt() {
		return otrMymeterspagePairanotherdeviceTxt;
	}

	public QAFWebElement getOtrMymeterspagePairmeterbackBtn() {
		return otrMymeterspagePairmeterbackBtn;
	}

	public QAFWebElement getOtrMymeterspagePairmeterCancelBtn() {
		return otrMymeterspagePairmeterCancelBtn;
	}

	public QAFWebElement getOtrMymeterspagePairmeterVerioflexImg() {
		return otrMymeterspagePairmeterVerioflexImg;
	}

	public QAFWebElement getOtrMymeterpagePairmeterNextBtn() {
		return otrMymeterpagePairmeterNextBtn;
	}

	public QAFWebElement getOtrMymeterpagePairmeterContinueBtn() {
		return otrMymeterpagePairmeterContinueBtn;
	}

	public QAFWebElement getOtrMymeterpagePairmeterPopupCancelBtn() {
		return otrMymeterpagePairmeterPopupCancelBtn;
	}

	// Method to verify My Meters UI
	public void myMetersUI() {
		getotrMymeterspagePairanotherdeviceaddBtn().verifyPresent("Pair Another Device Button Present");
		getotrMymeterspagePairanotherdeviceTxt().verifyPresent("Pair Another Device Text Present");
		getotrMymeterspageTimeChangeLbl().verifyPresent("Time Change Header Present");
		getotrMymeterspageTimechangemessageTxt().verifyPresent("Time Change Text Present");
		getotrMymeterspageTimeChangeSwitch().verifyPresent("Time Change Switch Present");
		getotrMymeterspageTitleLbl().verifyPresent("My Meters page Header Present");
	}

	HomePageAndroid homePageAndroid = new HomePageAndroid();
	// Method to verify time update switch off by default and then enable

	@FindBy(locator = "otr.mymeterspage.pairmeterback.btn")
	private QAFWebElement otrMymeterspagePairmeterbackBtn;

	@FindBy(locator = "otr.mymeterspage.pairmeter.cancel.btn")
	private QAFWebElement otrMymeterspagePairmeterCancelBtn;

	@FindBy(locator = "otr.mymeterspage.pairmeter.verioflex.img")
	private QAFWebElement otrMymeterspagePairmeterVerioflexImg;

	@FindBy(locator = "otr.mymeterpage.pairmeter.next.btn")
	private QAFWebElement otrMymeterpagePairmeterNextBtn;

	@FindBy(locator = "otr.mymeterpage.pairmeter.continue.btn")
	private QAFWebElement otrMymeterpagePairmeterContinueBtn;

	@FindBy(locator = "otr.mymeterpage.pairmeter.popup.cancel.btn")
	private QAFWebElement otrMymeterpagePairmeterPopupCancelBtn;

	public void timeUpdate() {
		Boolean timeChangeSwitch = otrMymeterspageTimeChangeSwitch.isSelected();
		if (timeChangeSwitch == true) {
			Reporter.logWithScreenShot("Time Switch On by Default");
		} else {
			getotrMymeterspageTimeChangeSwitch().click();
			otrMymeterspageTimeChangeSwitch.isSelected();
		}
		timeChangeSwitch.compareTo(timeChangeSwitch);
		Reporter.logWithScreenShot("Time Switch Turned on by User");
	}

	@Override
	protected void openPage(PageLocator arg0, Object... arg1) {
		// TODO Auto-generated method stub

	}

	public void clickToPairMeter() {
		getotrMymeterspagePairanotherdeviceaddBtn().waitForPresent();
		getotrMymeterspagePairanotherdeviceaddBtn().click();
		Reporter.logWithScreenShot("My Meter Connect page", MessageTypes.Pass);
		getOtrMymeterpagePairmeterNextBtn().verifyPresent("Next Button to proceed further is present");
		getOtrMymeterpagePairmeterNextBtn().click();
		getOtrMymeterpagePairmeterContinueBtn().verifyPresent("Continue button to turn on Bluetooth is present");
		getOtrMymeterpagePairmeterContinueBtn().click();
		getOtrMymeterpagePairmeterPopupCancelBtn().waitForPresent();
		Reporter.logWithScreenShot("Meter not found popup is displayed", MessageTypes.Pass);
		getOtrMymeterpagePairmeterPopupCancelBtn().click();

	}

	public void navigateToHomepage() {
		homePageAndroid.getOtrHomepageLogbookBtn().verifyPresent("Redirects to homepage");
	}

}