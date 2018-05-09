package com.lemonade.version3.android.pages;

import java.util.List;

import org.hamcrest.Matchers;
import org.openqa.selenium.Point;

import com.lemonade.support.JNJUtilsAndroid;
import com.lemonade.support.JNJUtilsIOS;
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

public class MySettingPageAndroid extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "otr.mysettingpage.titl")
	private QAFWebElement otrMysettingpageTitl;
	@FindBy(locator = "otr.mysettingpage.gen_male")
	private QAFWebElement otrMysettingpageGen_male;
	@FindBy(locator = "otr.mysettingpage.gen_female")
	private QAFWebElement otrMysettingpageGen_female;
	@FindBy(locator = "otr.mysettingpage.gender.txt")
	private QAFWebElement otrMysettingpageGenderTxt;
	@FindBy(locator = "otr.mysettingpage.range.txt")
	private QAFWebElement otrMysettingpageRangeTxt;
	@FindBy(locator = "otr.mysettingpage.high.lbl")
	private QAFWebElement otrMysettingpageHighLbl;
	@FindBy(locator = "otr.mysettingpage.low.lbl")
	private QAFWebElement otrMysettingpageLowLbl;
	@FindBy(locator = "otr.mysettingpage.low.unit.lbl")
	private QAFWebElement otrMysettingpageLowUnitLbl;
	@FindBy(locator = "otr.mysettingpage.high.unit.lbl")
	private QAFWebElement otrMysettingpageHighUnitLbl;
	@FindBy(locator = "otr.mysettingpage.mealtg.btn")
	private QAFWebElement otrMysettingpageMealtgBtn;
	@FindBy(locator = "otr.mysettingpage.premeal.logo")
	private QAFWebElement otrMysettingpagePremealLogo;
	@FindBy(locator = "otr.mysettingpage.post.logo")
	private QAFWebElement otrMysettingpagePostLogo;
	@FindBy(locator = "otr.mysettingpage.premeallow.range")
	private QAFWebElement otrMysettingpagePremeallowRange;
	@FindBy(locator = "otr.mysettingpage.premealhigh.range")
	private QAFWebElement otrMysettingpagePremealhighRange;
	@FindBy(locator = "otr.mysettingpage.postmeallow.range")
	private QAFWebElement otrMysettingpagePostmeallowRange;
	@FindBy(locator = "otr.mysettingpage.preUnit")
	private QAFWebElement otrMysettingpagePreUnit;
	@FindBy(locator = "otr.mysettingpage.postUnit")
	private QAFWebElement otrMysettingpagePostUnit;
	@FindBy(locator = "otr.mysettingpage.postmealhigh.range")
	private QAFWebElement otrMysettingpagePostmealhighRange;
	@FindBy(locator = "otr.mysettingpage.diabetiesMng.txt")
	private QAFWebElement otrMysettingpageDiabetiesMngTxt;
	@FindBy(locator = "otr.mysettingpage.diatExer.chkbox")
	private QAFWebElement otrMysettingpageDiatExerChkbox;
	@FindBy(locator = "otr.mysettingpage.oralMedication.chkbox")
	private QAFWebElement otrMysettingpageOralMedicationChkbox;
	@FindBy(locator = "otr.mysettingpage.injMed.chkbox")
	private QAFWebElement otrMysettingpageInjMedChkbox;
	@FindBy(locator = "otr.mysettingpage.longInsuline.chkbox")
	private QAFWebElement otrMysettingpageLongInsulineChkbox;
	@FindBy(locator = "otr.mysettingpage.mixedInsuline.chkbox")
	private QAFWebElement otrMysettingpageMixedInsulineChkbox;
	@FindBy(locator = "otr.mysettingpage.rapidInsuline.chkbox")
	private QAFWebElement otrMysettingpageRapidInsulineChkbox;
	@FindBy(locator = "otr.mysettingpage.InsulinePump.chkbox")
	private QAFWebElement otrMysettingpageInsulinePumpChkbox;
	@FindBy(locator = "otr.mysettingpage.diabetisQustn.ChkboxList")
	private List<QAFWebElement> otrmysettingpagediabetisQustnChkboxList;
	@FindBy(locator = "otr.mysettingpage.bg.rengehigh.lbl")
	private QAFWebElement otrMysettingpageBgRengehighLbl;
	@FindBy(locator = "otr.mysettingpage.bg.rengelow.lbl")
	private QAFWebElement otrMysettingpageBgRengelowLbl;
	@FindBy(locator = "otr.mysettingpage.bg.rengeunit.lbl")
	private QAFWebElement otrMysettingpageBgRengeunitLbl;
	@FindBy(locator = "otr.mysettingpage.bg.rengeok.btn")
	private QAFWebElement otrMysettingpageBgRengeokBtn;
	@FindBy(locator = "otr.mysettingpage.bg.patternok.btn")
	private QAFWebElement otrMysettingpageBgPatternokBtn;
	@FindBy(locator = "otr.mysettingpage.bg.renge.pkr")
	private QAFWebElement otrMysettingpageBgRengePkr;
	@FindBy(locator = "otr.mysettingpage.bg.ok.btn")
	private QAFWebElement otrMysettingpageBgOkBTn;
	@FindBy(locator = "otr.mysettingpage.gen_male")
	private QAFWebElement otrMysettingpageGenmale;
	@FindBy(locator = "otr.mysettingpage.gen_female")
	private QAFWebElement otrMysettingpageGenfemale;
	@FindBy(locator = "otr.mysettingpage.preUnit")
	private QAFWebElement otrMysettingpagePreunit;
	@FindBy(locator = "otr.mysettingpage.postUnit")
	private QAFWebElement otrMysettingpagePostunit;
	@FindBy(locator = "otr.mysettingpage.diatExer.chkbox")
	private QAFWebElement otrMysettingpageDiatexerChkbox;
	@FindBy(locator = "otr.mysettingpage.oralMedication.chkbox")
	private QAFWebElement otrMysettingpageOralmedicationChkbox;
	@FindBy(locator = "otr.mysettingpage.brkfst.lbl")
	private QAFWebElement otrMysettingpageBrkfstLbl;
	@FindBy(locator = "otr.mysettingpage.brkfst.begintime.btn")
	private QAFWebElement otrMysettingpageBrkfstBegintimeBtn;
	@FindBy(locator = "otr.mysettingpage.brkfst.endtime.btn")
	private QAFWebElement otrMysettingpageBrkfstEndtimeBtn;
	@FindBy(locator = "otr.mysettingpage.brkfsttime.frstvalue.pkr")
	private QAFWebElement otrMysettingpageBrkfsttimeFrstvaluePkr;
	@FindBy(locator = "otr.mysettingpage.brkfsttime.scndvalue.pkr")
	private QAFWebElement otrMysettingpageBrkfsttimeScndvaluePkr;
	@FindBy(locator = "otr.mysettingpage.brkfsttime.thrdvalue.pkr")
	private QAFWebElement otrMysettingpageBrkfsttimeThrdvaluePkr;
	@FindBy(locator = "otr.mysettingpage.overnight.begintime.btn")
	private QAFWebElement otrMysettingpageOvernightBegintimeBtn;
	@FindBy(locator = "otr.mysettingpage.overnight.endtime.btn")
	private QAFWebElement otrMysettingpageOvernightEndtimeBtn;
	@FindBy(locator = "otr.mysettingpage.lunch.begintime.btn")
	private QAFWebElement otrMysettingpageLunchBegintimeBtn;
	@FindBy(locator = "otr.mysettingpage.lunch.endtime.btn")
	private QAFWebElement otrMysettingpageLunchEndtimeBtn;
	@FindBy(locator = "otr.mysettingpage.dinner.begintime.btn")
	private QAFWebElement otrMysettingpageDinnerBegintimeBtn;
	@FindBy(locator = "otr.mysettingpage.dinner.endtime.btn")
	private QAFWebElement otrMysettingpageDinnerEndtimeBtn;
	@FindBy(locator = "otr.mysettingpage.bedtime.begintime.btn=")
	private QAFWebElement otrMysettingpageBedtimeBegintimeBtn;
	@FindBy(locator = "otr.mysettingpage.bedtime.endtime.btn")
	private QAFWebElement otrMysettingpageBedtimeEndtimeBtn;
	@FindBy(locator = "otr.mysettingpage.insulin.toggle.btn")
	private QAFWebElement otrMysettingpageInsulinToggleBtn;
	@FindBy(locator = "otr.mysettingpage.bg.beforeaftermeal.reading.lbl")
	private QAFWebElement otrMysettingpageBgBeforeaftermealReadingLbl;
	
	public QAFWebElement getOtrMysettingpageBgBeforeaftermealReadingLbl() {
		return otrMysettingpageBgBeforeaftermealReadingLbl;
	}

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getOtrMysettingpageBgOkBTn() {
		return otrMysettingpageBgOkBTn;
	}

	public QAFWebElement getOtrMysettingpageBgRengehighLbl() {
		return otrMysettingpageBgRengehighLbl;
	}

	public QAFWebElement getOtrMysettingpageBgRengelowLbl() {
		return otrMysettingpageBgRengelowLbl;
	}

	public QAFWebElement getOtrMysettingpageBgRengeunitLbl() {
		return otrMysettingpageBgRengeunitLbl;
	}

	public QAFWebElement getOtrMysettingpageBgRengeokBtn() {
		return otrMysettingpageBgRengeokBtn;
	}

	public QAFWebElement getOtrMysettingpageBgPatternokBtn() {
		return otrMysettingpageBgPatternokBtn;
	}

	public QAFWebElement getOtrMysettingpageBgRengePkr() {
		return otrMysettingpageBgRengePkr;
	}

	public QAFWebElement getOtrMysettingpageTitl() {
		return otrMysettingpageTitl;
	}

	public QAFWebElement getOtrMysettingpageGen_male() {
		return otrMysettingpageGen_male;
	}

	public QAFWebElement getOtrMysettingpageGen_female() {
		return otrMysettingpageGen_female;
	}

	public QAFWebElement getOtrMysettingpageGenderTxt() {
		return otrMysettingpageGenderTxt;
	}

	public QAFWebElement getOtrMysettingpageRangeTxt() {
		return otrMysettingpageRangeTxt;
	}

	public QAFWebElement getOtrMysettingpageHighLbl() {
		return otrMysettingpageHighLbl;
	}

	public QAFWebElement getOtrMysettingpageLowLbl() {
		return otrMysettingpageLowLbl;
	}

	public QAFWebElement getOtrMysettingpageLowUnitLbl() {
		return otrMysettingpageLowUnitLbl;
	}

	public QAFWebElement getOtrMysettingpageHighUnitLbl() {
		return otrMysettingpageHighUnitLbl;
	}

	public QAFWebElement getOtrMysettingpageMealtgBtn() {
		return otrMysettingpageMealtgBtn;
	}

	public QAFWebElement getOtrMysettingpagePremealLogo() {
		return otrMysettingpagePremealLogo;
	}

	public QAFWebElement getOtrMysettingpagePostLogo() {
		return otrMysettingpagePostLogo;
	}

	public QAFWebElement getOtrMysettingpagePremeallowRange() {
		return otrMysettingpagePremeallowRange;
	}

	public QAFWebElement getOtrMysettingpagePremealhighRange() {
		return otrMysettingpagePremealhighRange;
	}

	public QAFWebElement getOtrMysettingpagePostmeallowRange() {
		return otrMysettingpagePostmeallowRange;
	}

	public QAFWebElement getOtrMysettingpagePreUnit() {
		return otrMysettingpagePreUnit;
	}

	public QAFWebElement getOtrMysettingpagePostUnit() {
		return otrMysettingpagePostUnit;
	}

	public QAFWebElement getOtrMysettingpagePostmealhighRange() {
		return otrMysettingpagePostmealhighRange;
	}

	public QAFWebElement getOtrMysettingpageDiabetiesMngTxt() {
		return otrMysettingpageDiabetiesMngTxt;
	}

	public QAFWebElement getOtrMysettingpageDiatExerChkbox() {
		return otrMysettingpageDiatExerChkbox;
	}

	public QAFWebElement getOtrMysettingpageOralMedicationChkbox() {
		return otrMysettingpageOralMedicationChkbox;
	}

	public QAFWebElement getOtrMysettingpageInjMedChkbox() {
		return otrMysettingpageInjMedChkbox;
	}

	public QAFWebElement getOtrMysettingpageLongInsulineChkbox() {
		return otrMysettingpageLongInsulineChkbox;
	}

	public QAFWebElement getOtrMysettingpageMixedInsulineChkbox() {
		return otrMysettingpageMixedInsulineChkbox;
	}

	public QAFWebElement getOtrMysettingpageRapidInsulineChkbox() {
		return otrMysettingpageRapidInsulineChkbox;
	}

	public QAFWebElement getOtrMysettingpageInsulinePumpChkbox() {
		return otrMysettingpageInsulinePumpChkbox;
	}

	public List<QAFWebElement> getotrmysettingpagediabetisQustnChkboxList() {
		return otrmysettingpagediabetisQustnChkboxList;
	}

	public QAFWebElement getOtrMysettingpagePreunit() {
		return otrMysettingpagePreunit;
	}

	public QAFWebElement getOtrMysettingpagePostunit() {
		return otrMysettingpagePostunit;
	}

	public QAFWebElement getOtrMysettingpageDiatexerChkbox() {
		return otrMysettingpageDiatexerChkbox;
	}

	public QAFWebElement getOtrMysettingpageOralmedicationChkbox() {
		return otrMysettingpageOralmedicationChkbox;
	}

	public QAFWebElement getOtrMysettingpageBrkfstLbl() {
		return otrMysettingpageBrkfstLbl;
	}

	public QAFWebElement getOtrMysettingpageBrkfstBegintimeBtn() {
		return otrMysettingpageBrkfstBegintimeBtn;
	}

	public QAFWebElement getOtrMysettingpageBrkfstEndtimeBtn() {
		return otrMysettingpageBrkfstEndtimeBtn;
	}

	public QAFWebElement getOtrMysettingpageBrkfsttimeFrstvaluePkr() {
		return otrMysettingpageBrkfsttimeFrstvaluePkr;
	}

	public QAFWebElement getOtrMysettingpageBrkfsttimeScndvaluePkr() {
		return otrMysettingpageBrkfsttimeScndvaluePkr;
	}

	public QAFWebElement getOtrMysettingpageBrkfsttimeThrdvaluePkr() {
		return otrMysettingpageBrkfsttimeThrdvaluePkr;
	}

	public QAFWebElement getOtrMySettingpageStaticTextTxt(String text) {
		return JNJUtilsAndroid.getElement("otr.mysettingpage.statictext.txt", text);
	}

	public QAFWebElement getOtrMysettingpageOvernightBegintimeBtn() {
		return otrMysettingpageOvernightBegintimeBtn;
	}

	public QAFWebElement getOtrMysettingpageOvernightEndtimeBtn() {
		return otrMysettingpageOvernightEndtimeBtn;
	}

	public QAFWebElement getOtrMysettingpageLunchBegintimeBtn() {
		return otrMysettingpageLunchBegintimeBtn;
	}

	public QAFWebElement getOtrMysettingpageLunchEndtimeBtn() {
		return otrMysettingpageLunchEndtimeBtn;
	}

	public QAFWebElement getOtrMysettingpageDinnerBegintimeBtn() {
		return otrMysettingpageDinnerBegintimeBtn;
	}

	public QAFWebElement getOtrMysettingpageDinnerEndtimeBtn() {
		return otrMysettingpageDinnerEndtimeBtn;
	}

	public QAFWebElement getOtrMysettingpageBedtimeEndtimeBtn() {
		return otrMysettingpageBedtimeEndtimeBtn;
	}
	
	public QAFWebElement getOtrMysettingpageBedtimeBegintimeBtn() {
		return otrMysettingpageBedtimeBegintimeBtn;
	}
	
	
	@FindBy(locator = "otr.mysettingpage.diabetisQustn.Chkbox")
	private QAFWebElement otrmysettingpagediabetisQustnChkbox;
	public QAFWebElement getotrmysettingpagediabetisQustnChkbox() {
		return otrmysettingpagediabetisQustnChkbox;
	}
	
	

	// Method to verify my settting page
	public void verifyMySettingUI() {
		getOtrMysettingpageTitl().waitForPresent(3000);
		getOtrMysettingpageTitl().verifyPresent("My Setting Page Title Present");
	}

	public void clickOnMaleButton() {
		scrollToElementSettingScreen(getOtrMysettingpageGen_male());
		getOtrMysettingpageGen_male().click();
		Reporter.logWithScreenShot("Male button click", MessageTypes.Pass);

	}

	public void verifySelectedMaleButton() {
		if (getOtrMysettingpageGen_male().getAttribute("checked").equalsIgnoreCase("true")) {
			Reporter.logWithScreenShot("Male button is selected", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Male button is not selected", MessageTypes.Fail);
		}
	}

	public void clickOnFemaleButton() {
		if (getOtrMysettingpageGen_female().isPresent()) {
			getOtrMysettingpageGen_female().click();
			Reporter.logWithScreenShot("Female button click", MessageTypes.Pass);
		}
	}

	public void verifySelectedFemaleButton() {
		if (getOtrMysettingpageGen_female().getAttribute("checked").equalsIgnoreCase("true")) {
			Reporter.logWithScreenShot("Female button is selected", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Female button is not selected", MessageTypes.Fail);
		}
	}

/*	public void clickOnAllCheckboxes() {
		JNJUtilsAndroid.scrollToEleAndriod("I use an insulin pump");
		JNJUtilsAndroid.waitforLoad();
		for (int i = 0; i < 2; i++) {
			if (getotrmysettingpagediabetisQustnChkboxList().get(i).getAttribute("checked").equalsIgnoreCase("false")
					&& (!(getotrmysettingpagediabetisQustnChkboxList().get(i).isSelected()))) {
				getotrmysettingpagediabetisQustnChkboxList().get(i).click();
				if(getOtrMySettingpageStaticTextTxt("Yes").isEnabled()) {
					getOtrMySettingpageStaticTextTxt("Yes").click();
				}
				JNJUtilsAndroid.waitforLoad();
			}
		}
		Reporter.logWithScreenShot("Selected Checkbox ", MessageTypes.Pass);
	}
*/
	public void verifySelectedCheckboxes() {
		JNJUtilsAndroid.scrollToEleAndriod(ConfigurationManager.getBundle().getString("more.aboutme.diabetesManagement.pump"));
		JNJUtilsAndroid.waitforLoad();
		for (int i = 0; i < getotrmysettingpagediabetisQustnChkboxList().size(); i++) {
			if (getotrmysettingpagediabetisQustnChkboxList().get(i).getAttribute("checked").equalsIgnoreCase("true")) {
				Reporter.logWithScreenShot("All checkboxes are verified", MessageTypes.Pass);
			}
		}

	}
	
	
	


	public void selectCheckBox(QAFWebElement element){
		if(element.getAttribute("name").contains("checkbox")){
			element.click();
			
		}
	}
	
	public void checkAllCheckboxes() {
		JNJUtilsAndroid.scrollToEleAndriod(ConfigurationManager.getBundle().getString("more.aboutme.diabetesManagement.pump"));
		JNJUtilsAndroid.waitforLoad();
		for (QAFWebElement chkbox : getotrmysettingpagediabetisQustnChkboxList()) {
			System.out.println("List of checkboxes: "+getotrmysettingpagediabetisQustnChkboxList().size());
			if ((chkbox.isDisplayed()||chkbox.isEnabled()) &&(chkbox.getAttribute("checked").equalsIgnoreCase("false"))) {
				chkbox.click();
				if(JNJUtilsAndroid.tryMethod(getOtrMySettingpageStaticTextTxt(ConfigurationManager.getBundle().getString("appCommon.yes")))){
					Reporter.logWithScreenShot("Alert displayed", MessageTypes.Pass);
					getOtrMySettingpageStaticTextTxt(ConfigurationManager.getBundle().getString("appCommon.yes")).click();
					if ((chkbox.isDisplayed()||chkbox.isEnabled()) &&(chkbox.getAttribute("checked").equalsIgnoreCase("false"))) {
						chkbox.click();
				}	
				
				JNJUtilsAndroid.waitforLoad();
			}
			
		}
		JNJUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Checkbox Checked", MessageTypes.Pass);
		}
	} 
	
	public void uncheckAllCheckboxes() { // updated by Sangram,Used reverse iteration on list to solve problem
		JNJUtilsAndroid
				.scrollToEleAndriod(ConfigurationManager.getBundle().getString("more.aboutme.diabetesManagement.pump"));
		JNJUtilsAndroid.waitforLoad();
		for (int i = getotrmysettingpagediabetisQustnChkboxList().size() - 1; i >= 0; i--) {
			if (getotrmysettingpagediabetisQustnChkboxList().get(i).getAttribute("checked").equalsIgnoreCase("true")) {
				getotrmysettingpagediabetisQustnChkboxList().get(i).click();
				JNJUtilsAndroid.waitforLoad();
			}
		}
		Reporter.logWithScreenShot("Checkbox Unchecked", MessageTypes.Pass);

	}

	public void checkMealTagging() {
		if (getOtrMysettingpageMealtgBtn().getAttribute("text").toString().equalsIgnoreCase("OFF")) {
			Reporter.logWithScreenShot("Meal Tagging Button is Disable", MessageTypes.Pass);
		} else if (getOtrMysettingpageMealtgBtn().getAttribute("text").toString().equalsIgnoreCase("ON"))
			Reporter.logWithScreenShot("Meal Tagging button is enabled", MessageTypes.Pass);

	}

	// Method to set bg
	public void setBGRange(String type, String amount) {
		getOtrMysettingpageBgRengeokBtn().waitForVisible();
		type = type.toUpperCase();
		switch (type) {
		case "HIGH":
			getOtrMysettingpageBgRengeokBtn().click();
			getOtrMysettingpageBgRengePkr().sendKeys(amount);
			break;
		case "LOW":
			getOtrMysettingpageBgRengePkr().sendKeys(amount);
			getOtrMysettingpageBgRengeokBtn().click();
			break;

		}
		getOtrMysettingpageBgRengeokBtn().click();
	}

	// Method to verify setting bg high same as low
	public void setHighBGValueToLow() {
		if(getOtrMysettingpageMealtgBtn().getAttribute("text").equalsIgnoreCase("ON")){
			getOtrMysettingpageMealtgBtn().click();
		}
		getOtrMysettingpageBgRengelowLbl().waitForEnabled();
		getOtrMysettingpageBgRengelowLbl().click();
		// getOtrMysettingpageBgRengePkr().sendKeys("90");
		getOtrMysettingpageBgRengePkr().waitForPresent();
		JNJUtilsAndroid.selectPicker(getOtrMysettingpageBgRengePkr(), 90);
		Reporter.logWithScreenShot("Set low value", MessageTypes.Pass);
		getOtrMysettingpageBgRengeokBtn().click();
		// getOtrMysettingpageBgRengePkr().sendKeys("90");
		JNJUtilsAndroid.selectPicker(getOtrMysettingpageBgRengePkr(), 90);
		Reporter.logWithScreenShot("Set high value", MessageTypes.Pass);
		getOtrMysettingpageBgRengeokBtn().click();
		getOtrMysettingpageBgOkBTn().click();

	}

	// Method to verify setting bg low same as high
	public void setLowBGValueTOHigh() {
		
		if(getOtrMysettingpageMealtgBtn().getAttribute("text").equalsIgnoreCase("ON")){
			getOtrMysettingpageMealtgBtn().click();
		}
		getOtrMysettingpageBgRengelowLbl().waitForPresent();
		getOtrMysettingpageBgRengelowLbl().click();
		getOtrMysettingpageBgRengePkr().waitForPresent();
		// getOtrMysettingpageBgRengePkr().sendKeys("150");
		JNJUtilsAndroid.selectPicker(getOtrMysettingpageBgRengePkr(), 110);
		Reporter.logWithScreenShot("Set low value", MessageTypes.Pass);
		getOtrMysettingpageBgRengeokBtn().click();
		JNJUtilsAndroid.selectPicker(getOtrMysettingpageBgRengePkr(), 110);
		Reporter.logWithScreenShot("Set high value", MessageTypes.Pass);
		getOtrMysettingpageBgRengeokBtn().click();
		getOtrMysettingpageBgOkBTn().click();

	}

	// Method to verify after editing bg range are not same
	public void VerifyBGValue() {
		Validator.verifyThat("Note charcter length", Integer.parseInt(getOtrMysettingpageBgRengelowLbl().getText()),
				Matchers.lessThan(Integer.parseInt(getOtrMysettingpageBgRengehighLbl().getText())));

	}

	public void setBGBeforeAndAfter() {
		Reporter.logWithScreenShot("before updating", MessageTypes.Pass);
		if (getOtrMysettingpageMealtgBtn().getAttribute("checked").toString().equalsIgnoreCase("false")) {
			Reporter.logWithScreenShot("Meal Tagging Button is Disable", MessageTypes.Pass);
			getOtrMysettingpageMealtgBtn().click();
			Reporter.logWithScreenShot("Meal tagging button is enabled", MessageTypes.Pass);
		}
		getOtrMysettingpagePremealLogo().waitForPresent();
		getOtrMysettingpagePremealLogo().click();
		JNJUtilsAndroid.selectPicker(getOtrMysettingpageBgRengePkr(), 64);
		getOtrMysettingpageBgRengeokBtn().click();
		JNJUtilsAndroid.selectPicker(getOtrMysettingpageBgRengePkr(), 124);
		getOtrMysettingpageBgRengeokBtn().click();
		JNJUtilsAndroid.waitforLoad();
		
		if(JNJUtilsAndroid.tryMethod(getOtrMySettingpageStaticTextTxt(ConfigurationManager.getBundle().getString("appCommon.ok")))) {
			Reporter.logWithScreenShot("Update BG Warning", MessageTypes.Pass);
			getOtrMySettingpageStaticTextTxt(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
		}

		String bgLowBM = getOtrMysettingpagePremeallowRange().getText().toString();
		String bghighBM = getOtrMysettingpagePremealhighRange().getText().toString();
		Validator.verifyThat("Note charcter length", bgLowBM, Matchers.equalTo("64"));
		Validator.verifyThat("Note charcter length", bghighBM, Matchers.equalTo("124"));
		ConfigurationManager.getBundle().setProperty("BM.BG.Low", bgLowBM);
		ConfigurationManager.getBundle().setProperty("BM.BG.High", bghighBM);

		getOtrMysettingpagePostLogo().waitForVisible();
		getOtrMysettingpagePostLogo().click();
		JNJUtilsAndroid.selectPicker(getOtrMysettingpageBgRengePkr(), 65);
		getOtrMysettingpageBgRengeokBtn().click();
		JNJUtilsAndroid.selectPicker(getOtrMysettingpageBgRengePkr(), 175);
		getOtrMysettingpageBgRengeokBtn().click();
		JNJUtilsAndroid.waitforLoad();
		if (getOtrMysettingpageBgOkBTn().isPresent())
			if(JNJUtilsAndroid.tryMethod(getOtrMySettingpageStaticTextTxt("OK"))) {
				Reporter.logWithScreenShot("Update BG Warning", MessageTypes.Pass);
				getOtrMySettingpageStaticTextTxt(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
			}
		String bgLowAM = getOtrMysettingpagePostmeallowRange().getText().toString();
		String bghighAM = getOtrMysettingpagePostmealhighRange().getText().toString();
		Validator.verifyThat("Note charcter length", bgLowAM, Matchers.equalTo("65"));
		Validator.verifyThat("Note charcter length", bghighAM, Matchers.equalTo("175"));
		ConfigurationManager.getBundle().setProperty("AM.BG.Low", bgLowAM);
		ConfigurationManager.getBundle().setProperty("AM.BG.High", bghighAM);
		
		//Set BG ranges back to default
			/*	getOtrMysettingpagePremealLogo().waitForPresent();
				getOtrMysettingpagePremealLogo().click();
				JNJUtilsAndroid.selectPicker(getOtrMysettingpageBgRengePkr(), 70);
				getOtrMysettingpageBgRengeokBtn().click();
				JNJUtilsAndroid.selectPicker(getOtrMysettingpageBgRengePkr(), 130);
				getOtrMysettingpageBgRengeokBtn().click();
				JNJUtilsAndroid.waitforLoad();
				if(JNJUtilsAndroid.tryMethod(getOtrMySettingpageStaticTextTxt("OK"))) {
					Reporter.logWithScreenShot("Update BG Warning", MessageTypes.Pass);
					getOtrMySettingpageStaticTextTxt("OK").click();
				}
					getOtrMysettingpagePostLogo().waitForVisible();
					getOtrMysettingpagePostLogo().click();
					JNJUtilsAndroid.selectPicker(getOtrMysettingpageBgRengePkr(), 70);
					getOtrMysettingpageBgRengeokBtn().click();
					JNJUtilsAndroid.selectPicker(getOtrMysettingpageBgRengePkr(), 180);
					getOtrMysettingpageBgRengeokBtn().click();
					JNJUtilsAndroid.waitforLoad();
					if(JNJUtilsAndroid.tryMethod(getOtrMySettingpageStaticTextTxt("OK"))) {
						Reporter.logWithScreenShot("Update BG Warning", MessageTypes.Pass);
						getOtrMySettingpageStaticTextTxt("OK").click();
					}
				Reporter.logWithScreenShot("BG set to default", MessageTypes.Pass);*/
	}

	public void getBGValues() {
		if (getOtrMysettingpageMealtgBtn().getAttribute("text").toString().equalsIgnoreCase("OFF")) {
			Reporter.logWithScreenShot("Meal Tagging Button is Disable", MessageTypes.Pass);
			getOtrMysettingpageMealtgBtn().click();
			Reporter.logWithScreenShot("Meal tagging button is enabled", MessageTypes.Pass);
		}
		
		String bgLowBM = getOtrMysettingpagePremeallowRange().getText().toString();
		String bghighBM = getOtrMysettingpagePremealhighRange().getText().toString();
		//Validator.verifyThat("Note charcter length", bgLowBM, Matchers.equalTo("64"));
		//Validator.verifyThat("Note charcter length", bghighBM, Matchers.equalTo("124"));
		ConfigurationManager.getBundle().setProperty("BM.BG.Low", "bgLowBM");
		ConfigurationManager.getBundle().setProperty("BM.BG.High", "bghighBM");
		
		String bgLowAM = getOtrMysettingpagePostmeallowRange().getText().toString();
		String bghighAM = getOtrMysettingpagePostmealhighRange().getText().toString();
		//Validator.verifyThat("Note charcter length", bgLowAM, Matchers.equalTo("65"));
		//Validator.verifyThat("Note charcter length", bghighAM, Matchers.equalTo("175"));
		ConfigurationManager.getBundle().setProperty("AM.BG.Low", "bgLowAM");
		ConfigurationManager.getBundle().setProperty("AM.BG.High", "bghighAM");
		Reporter.logWithScreenShot("BG range on settings page", MessageTypes.Pass);
		
	}
	
	// Method to change bg value when toggle button in settings page is disabled
	public void changeBgValue() {
		if (getOtrMysettingpageMealtgBtn().getAttribute("checked").toString().equalsIgnoreCase("true")) {
			getOtrMysettingpageMealtgBtn().click();
			Reporter.logWithScreenShot("Meal Tagging Button is off", MessageTypes.Pass);
		}
		getOtrMysettingpageBgRengehighLbl().click();
		//getOtrMysettingpagePostLogo().waitForPresent();
		//getOtrMysettingpagePostLogo().click();
		JNJUtilsAndroid.selectPicker(getOtrMysettingpageBgRengePkr(), 71);
		getOtrMysettingpageBgRengeokBtn().waitForPresent();
		getOtrMysettingpageBgRengeokBtn().click();
		JNJUtilsAndroid.selectPicker(getOtrMysettingpageBgRengePkr(), 181);
		//Reporter.logWithScreenShot("Update BG Warning", MessageTypes.Pass);
		getOtrMysettingpageBgRengeokBtn().waitForPresent();
		getOtrMysettingpageBgRengeokBtn().click();
		
		if(JNJUtilsAndroid.tryMethod(getOtrMySettingpageStaticTextTxt("OK"))) {
			Reporter.logWithScreenShot("Update BG Warning", MessageTypes.Pass);
			getOtrMySettingpageStaticTextTxt(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
		}
		Reporter.logWithScreenShot("Updated Range", MessageTypes.Pass);
		
		//Set BG Range to default value
		getOtrMysettingpageBgRengehighLbl().click();
		JNJUtilsAndroid.selectPicker(getOtrMysettingpageBgRengePkr(), 70);
		getOtrMysettingpageBgRengeokBtn().waitForPresent();
		getOtrMysettingpageBgRengeokBtn().click();
		JNJUtilsAndroid.selectPicker(getOtrMysettingpageBgRengePkr(), 180);
		getOtrMysettingpageBgRengeokBtn().waitForPresent();
		getOtrMysettingpageBgRengeokBtn().click();
		//getOtrMysettingpageBgRengeokBtn().click();
		//getOtrMysettingpageBgPatternokBtn().click();

		Reporter.logWithScreenShot("Value returned to default", MessageTypes.Pass);
	}

	public void clickBeginTime() {
		scrollToElementSettingScreen(getOtrMysettingpageDinnerEndtimeBtn());
		Reporter.logWithScreenShot("Breakfast label is displayed", MessageTypes.Pass);
		
		//moving to changeBeginTime() to match iOS steps
		
		//String beginTime = getOtrMysettingpageBrkfstBegintimeBtn().getAttribute("text").toString();
		//getOtrMysettingpageBrkfstBegintimeBtn().click();
		//getOtrMysettingpageBrkfsttimeFrstvaluePkr().sendKeys("3");
		//getOtrMysettingpageBrkfsttimeScndvaluePkr().sendKeys("50");
		//getOtrMysettingpageBrkfsttimeThrdvaluePkr().sendKeys("PM");
		//getOtrMySettingpageStaticTextTxt("OK").click();
		//if (getOtrMysettingpageBrkfstBegintimeBtn().getAttribute("text").toString().equalsIgnoreCase(beginTime)) {
		//	Reporter.logWithScreenShot("Begin time is set as validated", MessageTypes.Pass);
		//} else
		//	Reporter.logWithScreenShot("Begin time is not validated properly", MessageTypes.Pass);
	}
	
	public void changeBeginTime() {
		//change time
		String beginTime = getOtrMysettingpageBrkfstBegintimeBtn().getAttribute("text").toString();
		getOtrMysettingpageBrkfstBegintimeBtn().click();
		getOtrMysettingpageBrkfsttimeFrstvaluePkr().waitForPresent();
		getOtrMysettingpageBrkfsttimeFrstvaluePkr().sendKeys("3");
		getOtrMysettingpageBrkfsttimeScndvaluePkr().sendKeys("00");
		getOtrMysettingpageBrkfsttimeThrdvaluePkr().sendKeys("AM");
		getOtrMySettingpageStaticTextTxt(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
		if (getOtrMysettingpageBrkfstBegintimeBtn().getAttribute("text").toString().equalsIgnoreCase(beginTime)) {
			Reporter.logWithScreenShot("Begin time is set as validated", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("Begin time is not validated properly", MessageTypes.Pass);
		
		
		//change time back to default
		getOtrMysettingpageBrkfstBegintimeBtn().waitForPresent();
		getOtrMysettingpageBrkfstBegintimeBtn().click();
		getOtrMysettingpageBrkfsttimeFrstvaluePkr().waitForPresent();
		getOtrMysettingpageBrkfsttimeFrstvaluePkr().sendKeys("5");
		getOtrMysettingpageBrkfsttimeScndvaluePkr().sendKeys("00");
		getOtrMysettingpageBrkfsttimeThrdvaluePkr().sendKeys("AM");
		getOtrMySettingpageStaticTextTxt(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
		getOtrMysettingpageBrkfstBegintimeBtn().waitForPresent();
		Reporter.logWithScreenShot("default time", MessageTypes.Pass);
	}

	// Verify default ranges for Time of Day
	public void verifyDefaultRangeTOD() {

		scrollToElementSettingScreen(getOtrMysettingpageBedtimeEndtimeBtn());
		//JNJUtilsAndroid.scrollToEleAndriod("Event Logging");
		Validator.verifyThat("Overnight Begin time", (getOtrMysettingpageOvernightBegintimeBtn().getText()),
				Matchers.equalTo("12:00 AM"));
		Validator.verifyThat("Overnight End time", (getOtrMysettingpageOvernightEndtimeBtn().getText()),
				Matchers.equalTo("5:00 AM"));
		Validator.verifyThat("BreakFast Begin time", (getOtrMysettingpageBrkfstBegintimeBtn().getText()),
				Matchers.equalTo("5:00 AM"));
		Validator.verifyThat("BreakFast End time", (getOtrMysettingpageBrkfstEndtimeBtn().getText()),
				Matchers.equalTo("11:00 AM"));
		Validator.verifyThat("Lunch Begin time", (getOtrMysettingpageLunchBegintimeBtn().getText()),
				Matchers.equalTo("11:00 AM"));
		Validator.verifyThat("Lunch End time", (getOtrMysettingpageLunchEndtimeBtn().getText()),
				Matchers.equalTo("5:00 PM"));
		Validator.verifyThat("Dinner Start time", (getOtrMysettingpageDinnerBegintimeBtn().getText()),
				Matchers.equalTo("5:00 PM"));
		Validator.verifyThat("Dinner End time", (getOtrMysettingpageDinnerEndtimeBtn().getText()),
				Matchers.equalTo("9:00 PM"));
		Validator.verifyThat("Bedtime Start time", (getOtrMysettingpageBedtimeBegintimeBtn().getText()),
				Matchers.equalTo("9:00 PM"));
		Validator.verifyThat("Bedtime End time", (getOtrMysettingpageBedtimeEndtimeBtn().getText()),
				Matchers.equalTo("12:00 AM"));

	}

	public void checkMealTaggingandClick(String option) {
		option = option.toLowerCase();
		switch (option) {
		case "off":
			if (getOtrMysettingpageMealtgBtn().getAttribute("checked").toString().equalsIgnoreCase("true")) {
				Reporter.logWithScreenShot("Meal Tagging Button is on", MessageTypes.Pass);
				getOtrMysettingpageMealtgBtn().click();
				Reporter.logWithScreenShot("Meal Tagging Button is off", MessageTypes.Pass);
			}
			break;
		case "on":
			if (getOtrMysettingpageMealtgBtn().getAttribute("checked").toString().equalsIgnoreCase("false")) {
				Reporter.logWithScreenShot("Meal Tagging Button is off", MessageTypes.Pass);
				getOtrMysettingpageMealtgBtn().click();
				Reporter.logWithScreenShot("Meal Tagging Button is on", MessageTypes.Pass);
			}
		}
	}

	public void scrollToElementSettingScreen(QAFWebElement element) {
		getOtrMysettingpageMealtgBtn().waitForPresent();
		Point p1 = getOtrMysettingpageMealtgBtn().getLocation();
		int count = 0;
		while (!JNJUtilsAndroid.tryMethod(element)) {
			JNJUtilsAndroid.swipeWithCoordinates(p1.getX() - 50, p1.getY() + 150, p1.getX() - 50, p1.getY() - 100, 10);
			if (count == 50)
				break;

		}

	}

	public void clickInsuliSwitch() {
		scrollToElementSettingScreen(getOtrMysettingpageInsulinToggleBtn());
		Reporter.logWithScreenShot("Insulin switch before clicking", MessageTypes.Pass);
		//if (getOtrMysettingpageInsulinToggleBtn().getAttribute("text").toString().equalsIgnoreCase("off"))
		//	getOtrMysettingpageInsulinToggleBtn().click();
		getOtrMysettingpageInsulinToggleBtn().click();
		Reporter.logWithScreenShot("Insulin switch clicked", MessageTypes.Pass);
	}

	public QAFWebElement getOtrMysettingpageInsulinToggleBtn() {
		return otrMysettingpageInsulinToggleBtn;
	}

	public void setLowHighOverallBG() {
		if (getOtrMysettingpageMealtgBtn().getAttribute("checked").toString().equalsIgnoreCase("true")) {
			getOtrMysettingpageMealtgBtn().click();
		}
		getOtrMysettingpageBgRengelowLbl().waitForPresent();
		getOtrMysettingpageBgRengelowLbl().click();
		setBG("70", "180");

		ConfigurationManager.getBundle().setProperty("Low.BG.Range.Value", "70");
		ConfigurationManager.getBundle().setProperty("High.BG.Range.Value", "180");

	}

	public void setBG(String low, String High) {
		int bgLow = Integer.parseInt(low);
		int bgHigh = Integer.parseInt(High);
		JNJUtilsAndroid.selectPicker(getOtrMysettingpageBgRengePkr(), bgLow);
		Reporter.logWithScreenShot("Set low value", MessageTypes.Pass);
		getOtrMysettingpageBgRengeokBtn().click();
		JNJUtilsAndroid.selectPicker(getOtrMysettingpageBgRengePkr(), bgHigh);
		Reporter.logWithScreenShot("Set high value", MessageTypes.Pass);
		getOtrMysettingpageBgRengeokBtn().click();
		if (getOtrMysettingpageBgOkBTn().isPresent())
			getOtrMysettingpageBgOkBTn().click();
	}

	public void chsngeLowHighOverallBG() {
		if (getOtrMysettingpageMealtgBtn().getAttribute("checked").toString().equalsIgnoreCase("true")) {
			getOtrMysettingpageMealtgBtn().click();
		}
		getOtrMysettingpageBgRengelowLbl().waitForPresent();
		getOtrMysettingpageBgRengelowLbl().click();
		setBG("60", "200");

	}

	public void chsngeLowHighOverallBGs(String low, String high) {
		if (getOtrMysettingpageMealtgBtn().getAttribute("checked").toString().equalsIgnoreCase("true")) {
			getOtrMysettingpageMealtgBtn().click();
		}
		getOtrMysettingpageBgRengelowLbl().waitForPresent();
		getOtrMysettingpageBgRengelowLbl().click();
		setBG(low, high);

	}

	//Method to verify canada mmol unit
	public void verifyCandammol() {
		if (getOtrMysettingpageMealtgBtn().getAttribute("text").toString().equalsIgnoreCase("OFF")) {
			getOtrMysettingpageMealtgBtn().click();
		}
		WebDriverTestCase.verifyTrue(getOtrMysettingpageBgBeforeaftermealReadingLbl().getAttribute("text").contains("mmol/L"),
				"mmol/L as unit not present for canada", "mmol/L as unit present for canada");

	}
	
	//SG Method to Navigate back from settings menus
	public void navigateBackFromSettings() {
		JNJUtilsAndroid.clickBackButton();
		Reporter.logWithScreenShot("navigated back", MessageTypes.Pass);
		
	}

	

}
