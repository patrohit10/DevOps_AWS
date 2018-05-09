package com.lemonade.version3.iOS.pages;



import com.lemonade.support.JNJUtilsIOS;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;


public class CountryselectionPageIOS
		extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "otrios.countryselectionPage.next.btn")
	private QAFWebElement otriosCountryselectionpageNextBtn;
	@FindBy(locator = "otrios.countryselectionPage.selectCountry.lbl")
	private QAFWebElement otriosCountryselectionpageSelectcountryLbl;
	@FindBy(locator = "otrios.countryselectionPage.onetouch.img")
	private QAFWebElement otriosCountryselectionpageOnetouchImg;
	@FindBy(locator = "otrios.countryselectionPage.whereLive.lbl")
	private QAFWebElement otriosCountryselectionpageWhereliveLbl;
	

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getOtriosCountryselectionpageNextBtn() {
		return otriosCountryselectionpageNextBtn;
	}

	public QAFWebElement getOtriosCountryselectionpageSelectcountryLbl() {
		return otriosCountryselectionpageSelectcountryLbl;
	}

	public QAFWebElement getOtriosCountryselectionpageOnetouchImg() {
		return otriosCountryselectionpageOnetouchImg;
	}

	public QAFWebElement getOtriosCountryselectionpageWhereliveLbl() {
		return otriosCountryselectionpageWhereliveLbl;
	}

	public QAFWebElement getOtriosCountryselectionpageStaticText(String text) {
		return JNJUtilsIOS.getElement("otrios.countryselectionPage.staticText.lbl", text);
	}
	public QAFWebElement getOtriosCountryselectionpageIagreeBtn() {
		return JNJUtilsIOS.getElement("otrios.countryselectionPage.iagree.btn",JNJUtilsIOS.getPropString("termsAndCond.agree").substring(2));
	}
	
	//Method to verify country selection page
	public void verifyCountrySelectionPage()
	{
		getOtriosCountryselectionpageSelectcountryLbl().waitForPresent();
		getOtriosCountryselectionpageSelectcountryLbl().verifyPresent("Select Country Label");
		getOtriosCountryselectionpageOnetouchImg().verifyPresent("OTR image");
		getOtriosCountryselectionpageWhereliveLbl().verifyPresent("Where You live question");
//		getOtriosCountryselectionpageNextBtn().verifyPresent("Next button");
		getOtriosCountryselectionpageStaticText(ConfigurationManager.getBundle().getProperty("country.unitedState").toString()).verifyPresent("United State");
		getOtriosCountryselectionpageStaticText(ConfigurationManager.getBundle().getProperty("country.osterreich").toString()).verifyPresent("Osterreich");
		getOtriosCountryselectionpageStaticText(ConfigurationManager.getBundle().getProperty("country.belgie").toString()).verifyPresent("Belgie");
		getOtriosCountryselectionpageStaticText(ConfigurationManager.getBundle().getProperty("country.canada").toString()).verifyPresent("Canada");
		getOtriosCountryselectionpageStaticText(ConfigurationManager.getBundle().getProperty("country.france").toString()).verifyPresent("France");
		getOtriosCountryselectionpageStaticText(ConfigurationManager.getBundle().getProperty("country.deutschland").toString()).verifyPresent("Deutschlandy");
		getOtriosCountryselectionpageStaticText(ConfigurationManager.getBundle().getProperty("country.italy").toString()).verifyPresent("Italia");
//SG 1-9-2017 Removing Nederlands per Sprint 4 User Story OTRIOS-1065
//		getOtriosCountryselectionpageStaticText(ConfigurationManager.getBundle().getProperty("country.netherland").toString()).verifyPresent("Netherland");
		scrllToCountry(ConfigurationManager.getBundle().getProperty("country.france").toString());
		getOtriosCountryselectionpageStaticText(ConfigurationManager.getBundle().getProperty("country.portugal").toString()).verifyPresent("Portugal");
		getOtriosCountryselectionpageStaticText(ConfigurationManager.getBundle().getProperty("country.spain").toString()).verifyPresent("Spain");
		getOtriosCountryselectionpageStaticText(ConfigurationManager.getBundle().getProperty("country.uk").toString()).verifyPresent("Uk and ireland");
		
	}
	//Method to click on single country and click on next
	public void selectCountry(String countryName)
	{
		 try{
			   getOtriosCountryselectionpageSelectcountryLbl().waitForPresent(5000);
			  }
			  catch(Exception e){
			   
			  }
		if(getOtriosCountryselectionpageSelectcountryLbl().isPresent())
		{
			scrllToCountry(countryName);
			JNJUtilsIOS.pause(1000);
			getOtriosCountryselectionpageStaticText(countryName).click();
			JNJUtilsIOS jnj=new JNJUtilsIOS();
			jnj.getDriver().tap(1, getOtriosCountryselectionpageStaticText(countryName), 100);
			Reporter.logWithScreenShot(countryName+" is selected",MessageTypes.Pass);
			getOtriosCountryselectionpageNextBtn().waitForEnabled();
			getOtriosCountryselectionpageNextBtn().click();
		}
		else{
			Reporter.logWithScreenShot("Country selection page not available",MessageTypes.Pass);
		}

		try{
//			driver.findElementByXPath("//UIANavigationBar[1]/UIAButton[3]").click();
			getOtriosCountryselectionpageIagreeBtn().waitForPresent(10000);
			if(getOtriosCountryselectionpageIagreeBtn().isPresent()){
				Reporter.logWithScreenShot("Country terms page",MessageTypes.Pass);
				getOtriosCountryselectionpageIagreeBtn().click();
			}
		}catch(Exception e){
			
		}
		
	}
	
	//method to scroll for specific country
	public void scrllToCountry(String countryName){
		int count=0;
		while(!JNJUtilsIOS.tryMethod(getOtriosCountryselectionpageStaticText(countryName)))
		{
			JNJUtilsIOS.swipeWithCoordinates(476, 1032, 443, 831, 10);
			JNJUtilsIOS.pause(1000);
			if(count==10)
				break;
			count++;
		}
	}

}
