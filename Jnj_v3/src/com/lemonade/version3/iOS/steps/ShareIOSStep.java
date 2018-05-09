package com.lemonade.version3.iOS.steps;

import com.lemonade.version3.iOS.pages.SharePageIOS;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class ShareIOSStep {
	
	SharePageIOS sharePage=new SharePageIOS();
	
	@QAFTestStep(description = "user verify share page")
	public void userVerifiesShareScreen() {
		sharePage.verifyShareScreen();
	}
	@QAFTestStep(description = "user verifies CSV share screen")
	public void userVerifiesCSVScreen() {
		sharePage.verifyCSVScreen();
	}
	@QAFTestStep(description = "user verifies time frame pop up")
	public void verifyTimeFramePopUp() {
		sharePage.timeFramePopUp();
	}
	@QAFTestStep(description = "user clicks on time frame button")
	public void clicksTimeFrameBtn() {
		sharePage.clickTimeFrameBtn();
	}
	@QAFTestStep(description = "user select {0} day as time frame")
	public void selecstTimeFrame(String day) {
		sharePage.selectTimeFrame(day);
	}
	@QAFTestStep(description = "user select share type as {0}")
	public void selecstShareType(String type) {
		sharePage.clickOnFromShareType(type);
	}
	@QAFTestStep(description = "user verify share text screen")
	public void verifyShareTextScreen() {
		sharePage.verifyShareTextScreen();
	}
	@QAFTestStep(description="user click on share pdf")
	public void shareToPDFiOS(){
		sharePage.sharePDFFIle();
	}

	@QAFTestStep(description="user click on export data csv")
	public void exportToCSV(){
		sharePage.clickExportButtonToShare();
	}
	
	@QAFTestStep(description="user verify share pdf timeframe sequence")
	public void verifyTimeframeOnPDF() {
		sharePage.clickOnPdfTimeframe();
	}

	@QAFTestStep(description="user verify share CSV timeFrame sequence")
	public void verifyTimeframeOnCSV() {
		sharePage.clickOnCsvTimeframe();
	}
	
	@QAFTestStep(description="user click on share last reading using text")
	public void shareLastReading(){
		sharePage.shareLastReadingUsingText();
	}
	@QAFTestStep(description="user click on share last reading using email")
	public void shareLastReadingViaEmail(){
		sharePage.shareLastReadingUsingEmail();
	}
	@QAFTestStep(description="user click on cancel button share page")
	public void clickOnCancelButtonSharePage(){
		sharePage.sharepageCancelButton();
	}

}
