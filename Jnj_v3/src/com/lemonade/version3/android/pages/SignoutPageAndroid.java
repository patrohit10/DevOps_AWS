package com.lemonade.version3.android.pages;

import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

public class SignoutPageAndroid extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "otr.homepage.menu.icon")
	private QAFWebElement otrHomepageMenuIcon;
	@FindBy(locator = "otr.hamburgermenu.account.btn")
	private QAFWebElement otrHamburgermenuAccountBtn;
	@FindBy(locator = "otr.accountpage.signout.btn")
	private QAFWebElement otrAcconutpageSignoutBtn;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getOtrHomepageMenuIcon() {
		return otrHomepageMenuIcon;
	}

	public QAFWebElement getOtrHamburgermenuAccountBtn() {
		return otrHamburgermenuAccountBtn;
	}

	public QAFWebElement getOtrAcconutpageSignoutBtn() {
		return otrAcconutpageSignoutBtn;
	}

	// Signing out
	public void signOut() {

		getOtrHomepageMenuIcon().click();
		if (getOtrHamburgermenuAccountBtn().isPresent()) {
			// System.out.println(element.getText() + " option present");
			Reporter.logWithScreenShot(getOtrHamburgermenuAccountBtn().getText() + " option present",
					MessageTypes.Pass);

			if (getOtrHamburgermenuAccountBtn().getText().equalsIgnoreCase("Account")) {
				getOtrHamburgermenuAccountBtn().waitForPresent();
				getOtrHamburgermenuAccountBtn().click();
				// System.out.println("Inside Account...");
				getOtrAcconutpageSignoutBtn().isPresent();
				Reporter.logWithScreenShot("Clicking on Signout button", MessageTypes.Pass);
				// System.out.println("Signout button is present");
				getOtrAcconutpageSignoutBtn().click();
			}
		}
	}
}
