package com.lemonade.version3.android.pages;

import com.lemonade.support.JNJUtilsAndroid;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

import io.appium.java_client.android.AndroidDriver;

public class ContactusPageAndroid extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "otr.homepage.moremenu.contactus.contactus.lbl")
	private QAFWebElement otrHomepageMoremenuContactusContactusLbl;
	@FindBy(locator = "otr.homepage.moremenu.contactus.email.lnk")
	private QAFWebElement otrHomepageMoremenuContactusEmailLnk;
	@FindBy(locator = "otr.homepage.moremenu.contactus.phno.lnk")
	private QAFWebElement otrHomepageMoremenuContactusPhnoLnk;
	@FindBy(locator = "otr.homepage.moremenu.contactus.website.lnk")
	private QAFWebElement otrHomepageMoremenuContactusWebsiteLnk;
	@FindBy(locator = "otr.homepage.moremenu.contactus.appversion.lbl")
	private QAFWebElement otrHomepageMoremenuContactusAppversionLbl;
	@FindBy(locator = "otr.homepage.moremenu.contactus.appversionnnumber.lbl")
	private QAFWebElement otrHomepageMoremenuContactusAppversionnnumberLbl;
	@FindBy(locator = "otr.homepage.moremenu.contactus.mobileos.lbl")
	private QAFWebElement otrHomepageMoremenuContactusMobileosLbl;
	@FindBy(locator = "otr.homepage.moremenu.contactus.mobileosnumber.lbl")
	private QAFWebElement otrHomepageMoremenuContactusMobileosnumberLbl;
	@FindBy(locator = "otr.homepage.moremenu.contactus.rateapp.lnk")
	private QAFWebElement otrHomepageMoremenuContactusRateAppLnk;

	public QAFWebElement getOtrHomepageMoremenuContactusRateAppLnk() {
		return otrHomepageMoremenuContactusRateAppLnk;
	}

	public QAFWebElement getOtrhomepagemoremenucontactuscontactuslbl() {
		return otrHomepageMoremenuContactusContactusLbl;
	}

	public QAFWebElement getOtrhomepagemoremenucontactusemaillnk() {
		return otrHomepageMoremenuContactusEmailLnk;
	}

	public QAFWebElement getOtrhomepagemoremenucontactusphnolnk() {
		return otrHomepageMoremenuContactusPhnoLnk;
	}

	public QAFWebElement getOtrhomepagemoremenucontactuswebsitelnk() {
		return otrHomepageMoremenuContactusWebsiteLnk;
	}

	public QAFWebElement getOtrhomepagemoremenucontactusappversionlbl() {
		return otrHomepageMoremenuContactusAppversionLbl;
	}

	public QAFWebElement getOtrhomepagemoremenucontactusappversionnnumberlbl() {
		return otrHomepageMoremenuContactusAppversionnnumberLbl;
	}

	public QAFWebElement getOtrhomepagemoremenucontactusmobileoslbl() {
		return otrHomepageMoremenuContactusMobileosLbl;
	}

	public QAFWebElement getOtrhomepagemoremenucontactusmobileosnumberlbl() {
		return otrHomepageMoremenuContactusMobileosnumberLbl;
	}

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	// Method to Verify Contact Us page from more menu
	public void verifyContactUsPage() {
		getOtrhomepagemoremenucontactuscontactuslbl().waitForPresent();
		getOtrhomepagemoremenucontactusemaillnk().verifyPresent("Email Link to Contact Customer helpdesk");
		getOtrhomepagemoremenucontactusphnolnk().verifyPresent("Phone Number to Contact Customer helpdesk");
		getOtrhomepagemoremenucontactuswebsitelnk().verifyPresent("Website to visit for Customer Support");
	}

	// Method to verify available email id for customer service
	public void verifyEmail() {
		String getMail = getOtrhomepagemoremenucontactusemaillnk().getText().toString();
		if (getMail.contains("@lifescan.co"))
			Reporter.logWithScreenShot("Customer Service Mail id is Verified", MessageTypes.Pass);
		else
			Reporter.logWithScreenShot("Customer Service Mail Id is Prohibited", MessageTypes.Fail);
		getOtrhomepagemoremenucontactusemaillnk().click();
		JNJUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Mail Options in Android", MessageTypes.Pass);
		JNJUtilsAndroid.clickBackButton();
	}

	// Method to call available customer care number
	public void callNumber() {
		getOtrhomepagemoremenucontactusphnolnk().waitForPresent();
		getOtrhomepagemoremenucontactusphnolnk().click();
		JNJUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Redirects to Call Customer Care", MessageTypes.Pass);
		JNJUtilsAndroid.clickBackButton();
	}

	// Method to visit application portal
	public void visitSite() {
		if (!(getOtrhomepagemoremenucontactuswebsitelnk().isPresent())){
			JNJUtilsAndroid.clickBackButton();
			System.out.println("Back button clicked two times");
		}
		getOtrhomepagemoremenucontactuswebsitelnk().click();
		JNJUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Application Website", MessageTypes.Pass);
		JNJUtilsAndroid.clickBackButton();
	}

	// Method to rate the app in playstore
	public void clickRateApp() {
		LogbookPageAndroid logbookPageAndroid = new LogbookPageAndroid();
		if (getOtrHomepageMoremenuContactusRateAppLnk().isPresent()) {
			/*logbookPageAndroid.getOtrLogbookpageStaticText(JNJUtilsAndroid.getPropString("rateUs.message"))
					.verifyPresent("Rate US label is present");*/
			getOtrHomepageMoremenuContactusRateAppLnk().click();
			JNJUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("Application is redirected to Google PlayStore", MessageTypes.Pass);
			JNJUtilsAndroid.clickBackButton();
		}
	}

	public void verifylabel() {
		LogbookPageAndroid logbookPageAndroid = new LogbookPageAndroid();
		if (getOtrHomepageMoremenuContactusRateAppLnk().isPresent()) {
			logbookPageAndroid.getOtrLogbookpageStaticText(JNJUtilsAndroid.getPropString("rateUs.message"))
					.verifyPresent("Rate US label is present");
		}
	}

}
