package com.lemonade.version3.android.steps;

import com.lemonade.version3.android.pages.SharePageAndroid;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class SharePageSteps {
	SharePageAndroid sharePage = new SharePageAndroid();
	@QAFTestStep(description="user verify share page")
	public void verifySharePage(){
		sharePage.verifyShare();
	}

	
	@QAFTestStep(description="user click on share pdf")
	public void shareToPDF(){
		sharePage.sharePDFFile();
	}
	@QAFTestStep(description="user click on export data csv")
	public void exportToCSV(){
		sharePage.clickExportButtonToShare();
	}
	
	@QAFTestStep(description="user click on share last reading using text")
	public void shareReadingUsingText(){
		sharePage.shareUsingText();
	}
	
	@QAFTestStep(description="user click on share last reading using email")
	public void shareReadingUsingEmail(){
		sharePage.shareUsingEmail();
	}
	
	@QAFTestStep(description = "user select share type as {0}")
	public void selecstShareType(String type) {
		sharePage.clickOnFromShareType(type);
	}
	
	@QAFTestStep(description = "user verify share text screen")
	public void verifyShareTextScreen() {
		sharePage.verifyShareTextScreen();
	}
	
	@QAFTestStep(description="user verify share pdf timeframe sequence")
	public void verifyPDFTimeSequence(){
		sharePage.verifyPDFtimeFrameSequence();
	}
	
	@QAFTestStep(description="user verify share CSV timeFrame sequence")
	public void verifyCSVTimeSequnece(){
		sharePage.verifyCSVTimeFrameSequence();
	}
	
	@QAFTestStep(description="user create a report")
	public void createPerfectoReport(){
		sharePage.createReportium();
	}
}
