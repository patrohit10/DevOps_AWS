package com.lemonade.version3.android.pages;

import java.util.List;

import com.lemonade.support.JNJUtilsAndroid;
import com.perfecto.reportium.model.Job;
import com.perfecto.reportium.model.PerfectoExecutionContext;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.perfecto.reportium.client.ReportiumClient;
import com.perfecto.reportium.client.ReportiumClientFactory;
import com.perfecto.reportium.exception.ReportiumException;
import com.perfecto.reportium.model.PerfectoExecutionContext;
import com.perfecto.reportium.model.Project;
import com.perfecto.reportium.test.TestContext;
import com.perfecto.reportium.test.result.TestResultFactory;

public class SharePageAndroid extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "otr.sharepage.sharelogo.lbl")
	private QAFWebElement otrSharepageSharelogoLbl;
	@FindBy(locator = "otr.sharepage.lastreadingshare.lbl")
	private QAFWebElement otrSharepageLastreadingshareLbl;
	@FindBy(locator = "otr.sharepage.sharewithtext.btn")
	private QAFWebElement otrSharepageSharewithtextBtn;
	@FindBy(locator = "otr.sharepage.sharewithemail.btn")
	private QAFWebElement otrSharepageSharewithemailBtn;
	@FindBy(locator = "otr.sharepage.sharereport.lbl")
	private QAFWebElement otrSharepageSharereportLbl;
	@FindBy(locator = "otr.sharepage.sharereport.pdfformat.btn")
	private QAFWebElement otrSharepageSharereportPdfformatBtn;
	@FindBy(locator = "otr.sharepage.exportdata.lbl")
	private QAFWebElement otrSharepageExportdataLbl;
	@FindBy(locator = "otr.sharepage.exportdata.csvformat.btn")
	private QAFWebElement otrSharepageExportdataCsvformatBtn;
	@FindBy(locator = "otr.sharepage.sharereportpage.pdf.lbl")
	private QAFWebElement otrSharepageShareReportPagePDFLbl;
	@FindBy(locator = "otr.sharepage.sharereportpage.timeframeselect.14days.lbl")
	private QAFWebElement otrSharepageShareReportPageTimeFrameSelect14DaysLbl;
	@FindBy(locator = "otr.sharepage.sharereportpage.text.newmsg.lbl")
	private QAFWebElement otrSharePageShareReportPageTextNewmsgLbl;
	@FindBy(locator = "otr.sharepage.sharereportpage.text.recipient.txt")
	private QAFWebElement otrSharePageShareReportPageTextRecipientTxt;
	@FindBy(locator = "otr.sharepage.sharereportpage.text.send.btn")
	private QAFWebElement otrSharepageShareReportPageTextSendBtn;
	@FindBy(locator = "otr.sharepage.sharereportpage.text.discard.txt")
	private QAFWebElement otrSharepageShareReportPageTextDiscardTxt;
	@FindBy(locator = "otr.sharepage.sharereportpage.OK.btn")
	private QAFWebElement otrSharepageSharereportpageOKBtn;

	public QAFWebElement getOtrSharePageShareReportPageTextNewmsgLbl() {
		return otrSharePageShareReportPageTextNewmsgLbl;
	}

	public QAFWebElement getotrSharepageSharereportpageOKBtn() {
		return otrSharepageSharereportpageOKBtn;
	}

	public QAFWebElement getOtrSharePageShareReportPageTextRecipientTxt() {
		return otrSharePageShareReportPageTextRecipientTxt;
	}

	public QAFWebElement getOtrSharepageShareReportPageTextSendBtn() {
		return otrSharepageShareReportPageTextSendBtn;
	}

	public QAFWebElement getOtrSharepageShareReportPageTimeFrameSelect14DaysLbl() {
		return otrSharepageShareReportPageTimeFrameSelect14DaysLbl;
	}

	public QAFWebElement getOtrSharepageSharereportPdfformatBtn() {
		return otrSharepageSharereportPdfformatBtn;
	}

	public QAFWebElement getOtrSharepageShareReportPagePDFLbl() {
		return otrSharepageShareReportPagePDFLbl;
	}

	public QAFWebElement getOtrSharepageSharereportPageTimeFormateSelectBtn() {
		return otrSharepageSharereportPageTimeFormateSelectBtn;
	}

	public QAFWebElement getOtrSharepageShareReportPageEmailReportBtn() {
		return otrSharepageShareReportPageEmailReportBtn;
	}

	public QAFWebElement getOtrSharePageShareeReportPagePrintReportBtn() {
		return otrSharePageShareeReportPagePrintReportBtn;
	}

	public QAFWebElement getOtrSharePageShareReportPageOpenWithReportBtn() {
		return otrSharePageShareReportPageOpenWithReportBtn;
	}

	public QAFWebElement getOtrSharepageShareReportPageTextDiscardTxt() {
		return otrSharepageShareReportPageTextDiscardTxt;
	}

	public List<QAFWebElement> getOtrSharepageSharereportpageTimeframeselectList() {
		return otrSharepageSharereportpageTimeframeselectList;
	}

	@FindBy(locator = "otr.sharepage.sharereportpage.timeframeselct.btn")
	private QAFWebElement otrSharepageSharereportPageTimeFormateSelectBtn;
	@FindBy(locator = "otr.sharepage.sharereportpage.emailreport.btn")
	private QAFWebElement otrSharepageShareReportPageEmailReportBtn;
	@FindBy(locator = "otr.sharepage.sharereportpage.printreport.btn")
	private QAFWebElement otrSharePageShareeReportPagePrintReportBtn;
	@FindBy(locator = "otr.sharepage.sharereportpage.openwithreport.btn")
	private QAFWebElement otrSharePageShareReportPageOpenWithReportBtn;
	@FindBy(locator = "otr.sharepage.sharereportpage.timeframeselect.list")
	private List<QAFWebElement> otrSharepageSharereportpageTimeframeselectList;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getOtrsharepagesharelogolbl() {
		return otrSharepageSharelogoLbl;
	}

	public QAFWebElement getOtrsharepagelastreadingsharelbl() {
		return otrSharepageLastreadingshareLbl;
	}

	public QAFWebElement getOtrsharepagesharewithtextbtn() {
		return otrSharepageSharewithtextBtn;
	}

	public QAFWebElement getOtrsharepagesharewithemailbtn() {
		return otrSharepageSharewithemailBtn;
	}

	public QAFWebElement getOtrsharepagesharereportlbl() {
		return otrSharepageSharereportLbl;
	}

	public QAFWebElement getOtrsharepagesharereportpdfformatbtn() {
		return otrSharepageSharereportPdfformatBtn;
	}

	public QAFWebElement getOtrsharepageexportdatalbl() {
		return otrSharepageExportdataLbl;
	}

	public QAFWebElement getOtrsharepageexportdatacsvformatbtn() {
		return otrSharepageExportdataCsvformatBtn;
	}

	// Method to verify Share page
	public void verifyShare() {
		// getOtrsharepagesharelogolbl().verifyPresent("Share Page is
		// displayed");
		getOtrsharepagelastreadingsharelbl().waitForPresent();
		getOtrsharepagelastreadingsharelbl().verifyPresent("Last Reading sharing option is present");
		getOtrsharepagesharewithtextbtn().verifyPresent("Text button");
		getOtrsharepagesharewithemailbtn().verifyPresent("Email button");
		getOtrsharepagesharereportlbl().verifyPresent("Share a report option is present");
		getOtrsharepagesharereportpdfformatbtn().verifyPresent("PDF button");
		getOtrsharepageexportdatalbl().verifyPresent("Export to CSV option is present");
		getOtrsharepageexportdatacsvformatbtn().verifyPresent("CSV button");

	}

	// Method to verify Timeframe Sequence
	public void verifyPDFtimeFrameSequence() {
		getOtrsharepagesharereportpdfformatbtn().click();
		getOtrSharepageShareReportPagePDFLbl().verifyPresent("Share Report in PDF format Page is displayed");
		getOtrSharepageSharereportPageTimeFormateSelectBtn().click();
		JNJUtilsAndroid.waitforLoad();
		if (getOtrSharepageSharereportpageTimeframeselectList().get(0).toString().equalsIgnoreCase("14 Days")
				|| getOtrSharepageSharereportpageTimeframeselectList().get(1).toString().equalsIgnoreCase("30 Days")
				|| getOtrSharepageSharereportpageTimeframeselectList().get(2).toString().equalsIgnoreCase("90 Days")) {
			Reporter.logWithScreenShot("Time Frame is in expected sequence", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Time Frame is not in expected sequence", MessageTypes.Pass);
		}
		getotrSharepageSharereportpageOKBtn().click();
		JNJUtilsAndroid.clickBackButton();
	}

	// Method to verify share report in PDF format
	public void sharePDFFile() {
		getOtrsharepagesharereportpdfformatbtn().click();
		getOtrSharepageShareReportPagePDFLbl().verifyPresent("Share Report in PDF format Page is displayed");
		getOtrSharepageSharereportPageTimeFormateSelectBtn().click();
		getOtrSharepageShareReportPageTimeFrameSelect14DaysLbl().waitForPresent();
		getOtrSharepageShareReportPageTimeFrameSelect14DaysLbl().click();
		getOtrSharepageShareReportPageEmailReportBtn().verifyPresent("Email report option is present");
		getOtrSharePageShareReportPageOpenWithReportBtn().verifyPresent("Open report options in present");
		JNJUtilsAndroid.clickBackButton();
	}

	// Method to verify time Frame sequence for CSV share
	public void verifyCSVTimeFrameSequence() {
		getOtrsharepageexportdatacsvformatbtn().waitForPresent();
		getOtrsharepageexportdatacsvformatbtn().click();
		getOtrSharepageSharereportPageTimeFormateSelectBtn().click();
		JNJUtilsAndroid.waitforLoad();
		if (getOtrSharepageSharereportpageTimeframeselectList().get(0).toString().equalsIgnoreCase("14 Days")
				|| getOtrSharepageSharereportpageTimeframeselectList().get(1).toString().equalsIgnoreCase("30 Days")
				|| getOtrSharepageSharereportpageTimeframeselectList().get(2).toString().equalsIgnoreCase("90 Days")) {
			Reporter.logWithScreenShot("Time Frame is in expected sequence", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Time Frame is not in expected sequence", MessageTypes.Pass);
		}

		getotrSharepageSharereportpageOKBtn().click();
	}

	// Method to click on Export Button to share in CSV format
	public void clickExportButtonToShare() {
		getOtrsharepageexportdatacsvformatbtn().waitForPresent();
		getOtrsharepageexportdatacsvformatbtn().click();
		getOtrSharepageSharereportPageTimeFormateSelectBtn().click();
		getOtrSharepageShareReportPageTimeFrameSelect14DaysLbl().waitForPresent();
		getOtrSharepageShareReportPageTimeFrameSelect14DaysLbl().click();
		getOtrSharepageShareReportPageEmailReportBtn().verifyPresent("Email report option is present");
		getOtrSharePageShareReportPageOpenWithReportBtn().verifyPresent("Open report options in present");
		JNJUtilsAndroid.clickBackButton();
	}

	// Method to click on share using text
	public void shareUsingText() {
		getOtrsharepagesharewithtextbtn().verifyPresent("Share report via text option is present");
		getOtrsharepagesharewithtextbtn().click();
		JNJUtilsAndroid.waitforLoad();
		JNJUtilsAndroid.clickBackButton();
		Reporter.logWithScreenShot("Text Message to share", MessageTypes.Pass);
		JNJUtilsAndroid.clickBackButton();
		try {
			getOtrSharepageShareReportPageTextDiscardTxt().waitForPresent(3000);
			getOtrSharepageShareReportPageTextDiscardTxt().click();
		} catch (Exception e) {
			Reporter.logWithScreenShot("Discard button is not present", MessageTypes.Pass);
		}
	}

	// Method to share report via Email
	public void shareUsingEmail() {
		getOtrsharepagesharewithemailbtn().verifyPresent("Share report via Email option is present");
		getOtrsharepagesharewithemailbtn().click();
		JNJUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Email options to share report", MessageTypes.Pass);
		JNJUtilsAndroid.clickBackButton();
		try {
			getOtrSharepageShareReportPageTextDiscardTxt().waitForPresent(3000);
			getOtrSharepageShareReportPageTextDiscardTxt().click();
		} catch (Exception e) {
			Reporter.logWithScreenShot("Discard button is not present", MessageTypes.Pass);
		}
	}

	// Method to click on share types
	public void clickOnFromShareType(String type) {
		getOtrsharepagelastreadingsharelbl().waitForPresent();
		type = type.toUpperCase();
		switch (type) {
		case "TEXT":
			getOtrsharepagesharewithtextbtn().click();
			JNJUtilsAndroid.waitforLoad();
			break;
		case "EMAIL":
			getOtrsharepagesharewithemailbtn().click();
			JNJUtilsAndroid.waitforLoad();
			break;
		case "PDF":
			getOtrSharepageSharereportPdfformatBtn().click();
			JNJUtilsAndroid.waitforLoad();
			break;
		case "CSV":
			getOtrsharepageexportdatacsvformatbtn().click();
			JNJUtilsAndroid.waitforLoad();
			break;

		}
		Reporter.logWithScreenShot("After selecting time share type as   " + type, MessageTypes.Pass);
	}

	// Method to verify share text screen
	public void verifyShareTextScreen() {
		JNJUtilsAndroid.clickBackButton();
		Reporter.logWithScreenShot("Share text screen is displayed", MessageTypes.Pass);
		JNJUtilsAndroid.clickBackButton();
		if (getOtrSharepageShareReportPageTextDiscardTxt().isPresent()) {
			getOtrSharepageShareReportPageTextDiscardTxt().click();
		} else {
			getOtrsharepagesharelogolbl().verifyPresent();
			Reporter.logWithScreenShot("Share screen after clicking on cancel button", MessageTypes.Pass);
		}
		getOtrsharepagesharelogolbl().verifyPresent();
		Reporter.logWithScreenShot("Share screen after clicking on cancel button", MessageTypes.Pass);

	}

	public void createReportium() {
		PerfectoExecutionContext perfectoExecutionContext = new PerfectoExecutionContext.PerfectoExecutionContextBuilder()
				.withProject(new Project("Lemonade Reportium", "1.0")).withJob(new Job("IOS tests", 45))
				.withContextTags("Regression").withWebDriver(driver).build();
		ReportiumClient reportiumClient = new ReportiumClientFactory()
				.createPerfectoReportiumClient(perfectoExecutionContext);

		try {
			reportiumClient.testStart("Lemonade open app scenario", new TestContext("Test1 tag1"));

			reportiumClient.testStep("User open app");
			CountrySelectionPageAndroid homePage = new CountrySelectionPageAndroid();
			homePage.openOTRApp();
			reportiumClient.testStop(TestResultFactory.createSuccess());
			driver.get(reportiumClient.getReportUrl());
		} catch (Exception e) {
			reportiumClient.testStop(TestResultFactory.createFailure(e.getMessage(), e));
			e.printStackTrace();
		}

	}

}
