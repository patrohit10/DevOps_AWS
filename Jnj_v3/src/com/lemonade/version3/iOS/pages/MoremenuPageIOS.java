package com.lemonade.version3.iOS.pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.commons.lang.RandomStringUtils;
import org.hamcrest.Matchers;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import com.lemonade.support.ConstantUtils;
import com.lemonade.support.JNJUtilsIOS;
import com.lemonade.version3.iOS.beans.UserDetailBeans;
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


public class MoremenuPageIOS extends WebDriverBaseTestPage<WebDriverTestPage> {

	
	@FindBy(locator = "otrios.moremenuPage.back.btn")
	private QAFWebElement otriosMoremenupageBackBtn;
	@FindBy(locator = "otrios.moremenuPage.mySetting.btn")
	private QAFWebElement otriosMoremenupageMysettingBtn;
	@FindBy(locator = "otrios.moremenuPage.myMeter.btn")
	private QAFWebElement otriosMoremenupageMymeterBtn;
	@FindBy(locator = "otrios.moremenuPage.myReminder.btn")
	private QAFWebElement otriosMoremenupageMyreminderBtn;
	@FindBy(locator = "otrios.moremenuPage.myAccount.btn")
	private QAFWebElement otriosMoremenupageMyaccountBtn;
	@FindBy(locator = "otrios.moremenuPage.help.btn")
	private QAFWebElement otriosMoremenupageHelpBtn;
	@FindBy(locator = "otrios.moremenuPage.contactus.btn")
	private QAFWebElement otriosMoremenupageContactusBtn;
	@FindBy(locator = "otrios.moremenuPage.logout.btn")
	private QAFWebElement otriosMoremenupageLogoutBtn;
	@FindBy(locator = "otrios.moremenuPage.termsOfUse.btn")
	private QAFWebElement otriosMoremenupageTermsofuseBtn;
	@FindBy(locator = "otrios.moremenuPage.privecyPolicy.btn")
	private QAFWebElement otriosMoremenupagePrivecypolicyBtn;
	@FindBy(locator = "otrios.moremenuPage.termsofService.back.btn")
	private QAFWebElement otriosMoremenupageTermsofserviceBackBtn;
	@FindBy(locator = "otrios.moremenuPage.contactUsTitle.lbl")
	private QAFWebElement otriosMoremenuPageContactUsTitleLbl;
	@FindBy(locator = "otrios.moremenuPage.contactEmail.lbl")
	private QAFWebElement otriosMoremenuPageContactEmailLbl;
	@FindBy(locator = "otrios.moremenuPage.contactNumber.lbl")
	private QAFWebElement otriosMoremenuPageContactNumberLbl;
	@FindBy(locator = "otrios.moremenuPage.contactSite.lbl")
	private QAFWebElement otriosMoremenuPageContactSiteLbl;
	@FindBy(locator = "otrios.moremenuPage.rateThisApp.lbl")
	private QAFWebElement otriosMoremenuPageRateThisAppLbl;
	@FindBy(locator = "otrios.moremenuPage.myMeter.autoUpdateTime.lbl")
	private QAFWebElement otriosMoremenuMyMeterAutoUpdateTimeLbl;
	@FindBy(locator = "otrios.moremenuPage.myMeter.autoUpdateTime.btn")
	private QAFWebElement otriosMoremenuMyMeterAutoUpdateTimeBtn;
	@FindBy(locator = "otrios.moremenuPage.myMeter.pairMeter.btn")
	private QAFWebElement otriosMoremenuMyMeterPairMeterBtn;
	@FindBy(locator = "otrios.moremenuPage.reminder.back.btn")
	private QAFWebElement otriosMoremenuReminderBackBtn;
	@FindBy(locator = "otrios.moremenuPage.reminder.add.btn")
	private QAFWebElement otriosMoremenuReminderAddBtn;
	@FindBy(locator = "otrios.moremenuPage.reminder.addMsg.lbl")
	private QAFWebElement otriosMoremenuReminderAddMsgBtn;
	@FindBy(locator = "otrios.moremenuPage.reminder.chooseReminder.lbl")
	private QAFWebElement otriosMoremenupageReminderChooseReminderlbl;
	@FindBy(locator = "otrios.moremenuPage.reminder.newReminder.lbl")
	private QAFWebElement otriosMoremenupageReminderNewReminderBtn;
	@FindBy(locator = "otrios.moremenuPage.reminder.addReminder.lbl")
	private QAFWebElement otriosMoremenupageReminderAddReminderlbl;
	@FindBy(locator = "otrios.moremenuPage.reminder.save.btn")
	private List<QAFWebElement> otriosMoremenupageReminderSaveBtn;
	@FindBy(locator = "otrios.moremenuPage.reminder.setReminder.lbl")
	private QAFWebElement otriosMoremenupageReminderSetReminderlbl;
	@FindBy(locator = "otrios.moremenuPage.reminder.reminderDescription.txt")
	private QAFWebElement otriosMoremenupageReminderReminderDescriptionTxt;
	@FindBy(locator = "otrios.moremenuPage.reminder.datetime.btn")
	private QAFWebElement otriosMoremenupageReminderDateTimeBtn;
	@FindBy(locator = "otrios.moremenuPage.reminder.reminderType.lbl")
	private QAFWebElement otriosMoremenupageReminderReminderTypeLbl;
	@FindBy(locator = "otrios.moremenuPage.reminder.repeat.btn")
	private QAFWebElement otriosMoremenupageReminderRepeatBtn;
	@FindBy(locator = "otrios.moremenuPage.reminder.date.pkr")
	private QAFWebElement otriosMoremenupageReminderDatePicker;
	@FindBy(locator = "otrios.moremenuPage.reminder.hour.pkr")
	private QAFWebElement otriosMoremenupageReminderHourPicker;
	@FindBy(locator = "otrios.moremenuPage.reminder.minute.pkr")
	private QAFWebElement otriosMoremenupageReminderMinutePicker;
	@FindBy(locator = "otrios.moremenuPage.reminder.saveTiming.lbl")
	private QAFWebElement otriosMoremenupageReminderSaveTiminglbl;
	@FindBy(locator = "otrios.moremenuPage.reminder.repeat.pkr")
	private QAFWebElement otriosMoremenupageReminderRepeatPicker;
	@FindBy(locator = "otrios.moremenuPage.reminder.repeat.pkr")
	private List<QAFWebElement> otriosMoremenupageReminderRepeatPickerList;
	@FindBy(locator = "otrios.moremenuPage.reminder.deteletPopUpDelete.btn")
	private QAFWebElement otriosMoremenupageReminderDeteletPopUpDeleteBtn;
	@FindBy(locator = "otrios.moremenuPage.reminder.addreminderBack.btn")
	private List<QAFWebElement> otriosMoremenupageReminderAddReminderTypeBackBtn;
	@FindBy(locator = "otrios.moremenuPage.reminder.addreminderField.txt")
	private QAFWebElement otriosMoremenupageReminderAddreminderFieldTxt;
	@FindBy(locator = "otrios.moremenuPage.reminder.reminder.lbl")
	private QAFWebElement otriosMoremenupageRemindersTitle;
	@FindBy(locator = "otrios.Moremenupage.connection.btn")
	private QAFWebElement otriosMoremenupageConnectionBtn;
	@FindBy(locator = "otrios.Moremenupage.connection.applehealth.lbl")
	private QAFWebElement otriosMoremenupageConnectionApplehealthLbl;
	@FindBy(locator = "otrios.Moremenupage.connection.applehealth.swch")
	private QAFWebElement otriosMoremenupageConnectionApplehealthSwch;
	@FindBy(locator = "otrios.Moremenupage.connection.addoffice.btn")
	private QAFWebElement otriosMoremenupageConnectionAddofficeBtn;
	@FindBy(locator = "otrios.Moremenupage.connection.addofficeCancel.btn")
	private QAFWebElement otriosMoremenupageConnectionAddofficecancelBtn;
	@FindBy(locator = "otrios.Moremenupage.connection.addofficeDeleteDraft.btn")
	private QAFWebElement otriosMoremenupageConnectionAddofficedeletedraftBtn;
	@FindBy(locator = "otrios.Moremenupage.connection.addofficeSearch.btn")
	private QAFWebElement otriosMoremenupageConnectionAddofficesearchBtn;
	@FindBy(locator = "otrios.Moremenupage.connection.addofficeTitle.lbl")
	private QAFWebElement otriosMoremenupageConnectionAddofficetitleLbl;
	@FindBy(locator = "otrios.Moremenupage.connection.addofficeEnterCode.lbl")
	private QAFWebElement otriosMoremenupageConnectionAddofficeentercodeLbl;
	@FindBy(locator = "otrios.Moremenupage.connection.walgreen.switch")
	private QAFWebElement otriosMoremenupageConnectionWalgreenSwitch;
	@FindBy(locator = "otrios.Moremenupage.connection.walgreen.lbl")
	private QAFWebElement otriosMoremenupageConnectionWalgreenLbl;
	@FindBy(locator = "otrios.Moremenupage.connection.importpopup.lbl")
	private QAFWebElement otriosMoremenupageConnectionImportpopupLbl;
	@FindBy(locator = "otrios.Moremenupage.connection.importpopup.enablenow.btn")
	private QAFWebElement otriosMoremenupageConnectionImportpopupEnablenowBtn;
	@FindBy(locator = "otrios.Moremenupage.connection.officereenter.btn")
	private QAFWebElement otriosMoremenupageConnectionOfficereenterBtn;
	@FindBy(locator = "otrios.Moremenupage.connection.officeyes.btn")
	private QAFWebElement otriosMoremenupageConnectionOfficeyesBtn;
	@FindBy(locator = "otrios.Moremenupage.connection.officeqst.lbl")
	private QAFWebElement otriosMoremenupageConnectionOfficeqstLbl;
	@FindBy(locator = "otrios.Moremenupage.connection.officename.lbl")
	private QAFWebElement otriosMoremenupageConnectionOfficenameLbl;
	@FindBy(locator = "otrios.Moremenupage.connection.officecontact.lbl")
	private QAFWebElement otriosMoremenupageConnectionOfficecontactLbl;
	@FindBy(locator = "otrios.Moremenupage.connection.done.btn")
	private QAFWebElement otriosMoremenupageConnectionDoneBtn;
	@FindBy(locator = "otrios.Moremenupage.connection.checkbox.lbl")
	private QAFWebElement otriosMoremenupageConnectionCheckboxLbl;
	@FindBy(locator = "otrios.Moremenupage.connection.requestSubmited.lbl")
	private QAFWebElement otriosMoremenupageConnectionRequestsubmitedLbl;
	@FindBy(locator = "otrios.Moremenupage.connection.withdrawrequest.btn")
	private QAFWebElement otriosMoremenupageConnectionWithdrawrequestBtn;
	@FindBy(locator = "otrios.moremenuPage.other.back.btn")
	private List<QAFWebElement> otriosMoremenupagebackndBtn;
	@FindBy(locator = "otrios.Moremenupage.contatcus.returnto.btn")
	private QAFWebElement otriosMoremenupageContactusReturnBtn;
	@FindBy(locator = "otrios.Moremenupage.contactusdeletedraft.btn")
	private QAFWebElement otriosMoremenupageContactusDeleteDraftBtn;
	@FindBy(locator = "otrios.Moremenupage.reminder.alertpopupok.btn")
	private QAFWebElement otriosMoremenupageReminderAlertOkBtn;
	@FindBy(locator = "otrios.Moremenupage.reteappback.btn")
	private QAFWebElement otriosMoremenupageRateappBackBtn;
	@FindBy(locator="otrios.MoremenuPage.reminder.name.txt")
	private QAFWebElement otriosMoremenuPageReminderNameTxt;
	@FindBy(locator="otrios.Moremenupage.reminder.synToggle.btn")
	private QAFWebElement otriosMoremenupageReminderSynToggleBtn;
	@FindBy(locator="otrios.Moremenupage.reminder.Done.btn")
	private QAFWebElement otriosMoremenupageReminderDoneBtn;
	@FindBy(locator="otrios.moremenuPage.myMeter.veriometer.img")
	private QAFWebElement otriosMoremenupageMymeterVeriometerImg;
	@FindBy(locator="otrios.moremenuPage.connection.chk")
	private QAFWebElement otriosMoremenupageConnectionWalgreenChk;
	@FindBy(locator = "otrios.moremenuPage.connection.walgreen.email.txt")
	private QAFWebElement otriosMoremenuPageConnectionWalgreenEmailTxt;
	@FindBy(locator = "otrios.moremenuPage.connection.walgreen.password.txt")
	private QAFWebElement otriosMoremenuPageConnectionWalgreenPasswordTxt;
	@FindBy(locator = "otrios.moremenuPage.connection.walgreen.signin.btn")
	private QAFWebElement otriosMoremenuPageConnectionWalgreenSigninBtn;
	@FindBy(locator = "otrios.moremenuPage.connection.walgreen.yes.btn")
	private QAFWebElement otriosMoremenuPageConnectionWalgreenYesBtn;
	@FindBy(locator = "otrios.moremenuPage.connection.walgreen.no.btn")
	private QAFWebElement otriosMoremenuPageConnectionWalgreenNoBtn;
	@FindBy(locator = "otrios.moremenuPage.connection.walgreen.finish.btn")
	private QAFWebElement otriosMoremenuPageConnectionWalgreenFinishBtn;
	@FindBy(locator = "otrios.moremenuPage.connection.walgreen.term.lnk")
	private QAFWebElement otriosMoremenuPageConnectionWalgreenTermLnk;
	@FindBy(locator = "otrios.moremenuPage.connection.walgreen.privecy.lnk")
	private QAFWebElement otriosMoremenuPageConnectionWalgreenPrivecyLnk;
	@FindBy(locator = "otrios.moremenuPage.connection.walgreen.cancel.btn")
	private QAFWebElement otriosMoremenuPageConnectionWalgreenCancelBtn;
	@FindBy(locator = "otrios.moremenuPage.connection.walgreen.enable.btn")
	private QAFWebElement otriosMoremenuPageConnectionWalgreenEnableBtn;

	
	
	
	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}
	
	
	
	public QAFWebElement getOtriosMoremenuPageConnectionWalgreenTermLnk() {
		return otriosMoremenuPageConnectionWalgreenTermLnk;
	}

	public QAFWebElement getOtriosMoremenuPageConnectionWalgreenPrivecyLnk() {
		return otriosMoremenuPageConnectionWalgreenPrivecyLnk;
	}

	public QAFWebElement getOtriosMoremenuPageConnectionWalgreenCancelBtn() {
		return otriosMoremenuPageConnectionWalgreenCancelBtn;
	}

	public QAFWebElement getOtriosMoremenuPageConnectionWalgreenEnableBtn() {
		return otriosMoremenuPageConnectionWalgreenEnableBtn;
	}
	public QAFWebElement getOtriosMoremenuPageConnectionWalgreenFinishBtn() {
		return otriosMoremenuPageConnectionWalgreenFinishBtn;
	}
	public QAFWebElement getOtriosMoremenuPageConnectionWalgreenEmailTxt() {
		return otriosMoremenuPageConnectionWalgreenEmailTxt;
	}

	public QAFWebElement getOtriosMoremenuPageConnectionWalgreenPasswordTxt() {
		return otriosMoremenuPageConnectionWalgreenPasswordTxt;
	}

	public QAFWebElement getOtriosMoremenuPageConnectionWalgreenSigninBtn() {
		return otriosMoremenuPageConnectionWalgreenSigninBtn;
	}

	public QAFWebElement getOtriosMoremenuPageConnectionWalgreenYesBtn() {
		return otriosMoremenuPageConnectionWalgreenYesBtn;
	}

	public QAFWebElement getOtriosMoremenuPageConnectionWalgreenNoBtn() {
		return otriosMoremenuPageConnectionWalgreenNoBtn;
	}
	
	public QAFWebElement getOtriosMoremenupageConnectionWalgreenChk() {
		return otriosMoremenupageConnectionWalgreenChk;
	}
	public QAFWebElement getOtriosMoremenupageMymeterVeriometerImg() {
		return otriosMoremenupageMymeterVeriometerImg;
	}
	public QAFWebElement getOtriosMoremenupageRateappBackBtn() {
		return otriosMoremenupageRateappBackBtn;
	}
	public QAFWebElement getOtriosMoremenupageReminderAlertOkBtn() {
		return otriosMoremenupageReminderAlertOkBtn;
	}
	public QAFWebElement getOtriosMoremenupageContactusDeleteDraftBtn() {
		return otriosMoremenupageContactusDeleteDraftBtn;
	}
	public QAFWebElement getOtriosMoremenupageContactusReturnBtn() {
		return otriosMoremenupageContactusReturnBtn;
	}
	public List<QAFWebElement> getOotriosMoremenupagebackndBtn() {
		return otriosMoremenupagebackndBtn;
	}
	public QAFWebElement getOtriosMoremenupageConnectionOfficereenterBtn() {
		return otriosMoremenupageConnectionOfficereenterBtn;
	}

	public QAFWebElement getOtriosMoremenupageConnectionOfficeyesBtn() {
		return otriosMoremenupageConnectionOfficeyesBtn;
	}

	public QAFWebElement getOtriosMoremenupageConnectionOfficeqstLbl() {
		return otriosMoremenupageConnectionOfficeqstLbl;
	}

	public QAFWebElement getOtriosMoremenupageConnectionOfficenameLbl() {
		return otriosMoremenupageConnectionOfficenameLbl;
	}

	public QAFWebElement getOtriosMoremenupageConnectionOfficecontactLbl() {
		return otriosMoremenupageConnectionOfficecontactLbl;
	}

	public QAFWebElement getOtriosMoremenupageConnectionDoneBtn() {
		return otriosMoremenupageConnectionDoneBtn;
	}

	public QAFWebElement getOtriosMoremenupageConnectionCheckboxLbl() {
		return otriosMoremenupageConnectionCheckboxLbl;
	}

	public QAFWebElement getOtriosMoremenupageConnectionRequestsubmitedLbl() {
		return otriosMoremenupageConnectionRequestsubmitedLbl;
	}

	public QAFWebElement getOtriosMoremenupageConnectionWithdrawrequestBtn() {
		return otriosMoremenupageConnectionWithdrawrequestBtn;
	}
	public QAFWebElement getOtriosMoremenupageConnectionWalgreenSwitch() {
		return otriosMoremenupageConnectionWalgreenSwitch;
	}

	public QAFWebElement getOtriosMoremenupageConnectionWalgreenLbl() {
		return otriosMoremenupageConnectionWalgreenLbl;
	}

	public QAFWebElement getOtriosMoremenupageConnectionImportpopupLbl() {
		return otriosMoremenupageConnectionImportpopupLbl;
	}

	public QAFWebElement getOtriosMoremenupageConnectionImportpopupEnablenowBtn() {
		return otriosMoremenupageConnectionImportpopupEnablenowBtn;
	}
	
	public QAFWebElement getOtriosMoremenupageConnectionApplehealthLbl() {
		return otriosMoremenupageConnectionApplehealthLbl;
	}

	public QAFWebElement getOtriosMoremenupageConnectionApplehealthSwch() {
		return otriosMoremenupageConnectionApplehealthSwch;
	}

	public QAFWebElement getOtriosMoremenupageConnectionAddofficeBtn() {
		return otriosMoremenupageConnectionAddofficeBtn;
	}

	public QAFWebElement getOtriosMoremenupageConnectionAddofficecancelBtn() {
		return otriosMoremenupageConnectionAddofficecancelBtn;
	}

	public QAFWebElement getOtriosMoremenupageConnectionAddofficedeletedraftBtn() {
		return otriosMoremenupageConnectionAddofficedeletedraftBtn;
	}
	
	public QAFWebElement getOtriosMoremenupageConnectionAddofficesearchBtn() {
		return otriosMoremenupageConnectionAddofficesearchBtn;
	}

	public QAFWebElement getOtriosMoremenupageConnectionAddofficetitleLbl() {
		return otriosMoremenupageConnectionAddofficetitleLbl;
	}

	public QAFWebElement getOtriosMoremenupageConnectionAddofficeentercodeLbl() {
		return otriosMoremenupageConnectionAddofficeentercodeLbl;
	}

	public QAFWebElement getOtriosMoremenupageRemindersTitle() {
		return otriosMoremenupageRemindersTitle;
	}

	public QAFWebElement getOtriosMoremenupageReminderAddreminderFieldTxt() {
		return otriosMoremenupageReminderAddreminderFieldTxt;
	}

	public List<QAFWebElement> getOtriosMoremenupageReminderAddReminderTypeBackBtn() {
		return otriosMoremenupageReminderAddReminderTypeBackBtn;
	}

	public QAFWebElement getOtriosMoremenupageReminderDeteletPopUpDeleteBtn() {
		return otriosMoremenupageReminderDeteletPopUpDeleteBtn;
	}

	public QAFWebElement getOtriosMoremenupageReminderRepeatPicker() {
		return otriosMoremenupageReminderRepeatPicker;
	}
	public List<QAFWebElement> getOtriosMoremenupageReminderRepeatPickerList() {
		return otriosMoremenupageReminderRepeatPickerList;
	}

	public QAFWebElement getOtriosMoremenupageReminderSaveTiminglbl() {
		return otriosMoremenupageReminderSaveTiminglbl;
	}

	public QAFWebElement getOtriosMoremenupageReminderMinutePicker() {
		return otriosMoremenupageReminderMinutePicker;
	}

	public QAFWebElement getOtriosMoremenupageReminderHourPicker() {
		return otriosMoremenupageReminderHourPicker;
	}

	public QAFWebElement getOtriosMoremenupageReminderDatePicker() {
		return otriosMoremenupageReminderDatePicker;
	}

	public QAFWebElement getOtriosMoremenupageReminderRepeatBtn() {
		return otriosMoremenupageReminderRepeatBtn;
	}

	public QAFWebElement getOtriosMoremenupageReminderReminderTypeLbl() {
		return otriosMoremenupageReminderReminderTypeLbl;
	}

	public QAFWebElement getOtriosMoremenupageReminderDateTimeBtn() {
		return otriosMoremenupageReminderDateTimeBtn;
	}

	public QAFWebElement getOtriosMoremenupageReminderReminderDescriptionTxt() {
		return otriosMoremenupageReminderReminderDescriptionTxt;
	}

	public QAFWebElement getOtriosMoremenupageReminderSetReminderlbl() {
		return otriosMoremenupageReminderSetReminderlbl;
	}

	public List<QAFWebElement> getOtriosMoremenupageReminderSaveBtn() {
		return otriosMoremenupageReminderSaveBtn;
	}

	public QAFWebElement getOtriosMoremenupageReminderAddReminderlbl() {
		return otriosMoremenupageReminderAddReminderlbl;
	}

	public QAFWebElement getOtriosMoremenupageReminderNewReminderBtn() {
		return otriosMoremenupageReminderNewReminderBtn;
	}

	public QAFWebElement getOtriosMoremenupageReminderChooseReminderlbl() {
		return otriosMoremenupageReminderChooseReminderlbl;
	}

	public QAFWebElement getOtriosMoremenuReminderAddMsgBtn() {
		return otriosMoremenuReminderAddMsgBtn;
	}

	public QAFWebElement getOtriosMoremenuReminderAddBtn() {
		return otriosMoremenuReminderAddBtn;
	}

	public QAFWebElement getOtriosMoremenuReminderBackBtn() {
		return otriosMoremenuReminderBackBtn;
	}

	public QAFWebElement getOtriosMoremenuMyMeterPairMeterBtn() {
		return otriosMoremenuMyMeterPairMeterBtn;
	}

	public QAFWebElement getOtriosMoremenuMyMeterAutoUpdateTimeBtn() {
		return otriosMoremenuMyMeterAutoUpdateTimeBtn;
	}

	public QAFWebElement getOtriosMoremenuMyMeterAutoUpdateTimeLbl() {
		return otriosMoremenuMyMeterAutoUpdateTimeLbl;
	}

	public QAFWebElement getOtriosMoremenuPageRateThisAppLbl() {
		return otriosMoremenuPageRateThisAppLbl;
	}

	public QAFWebElement getOtriosMoremenuPageContactSiteLbl() {
		return otriosMoremenuPageContactSiteLbl;
	}

	public QAFWebElement getOtriosMoremenuPageContactNumberLbl() {
		return otriosMoremenuPageContactNumberLbl;
	}

	public QAFWebElement getOtriosMoremenuPageContactEmailLbl() {
		return otriosMoremenuPageContactEmailLbl;
	}

	public QAFWebElement getOtriosMoremenuPageContactUsTitleLbl() {
		return otriosMoremenuPageContactUsTitleLbl;
	}



	public QAFWebElement getOtriosMoremenupageBackBtn() {
		return otriosMoremenupageBackBtn;
	}

	public QAFWebElement getOtriosMoremenupageMysettingBtn() {
		return otriosMoremenupageMysettingBtn;
	}

	public QAFWebElement getOtriosMoremenupageMymeterBtn() {
		return otriosMoremenupageMymeterBtn;
	}

	public QAFWebElement getOtriosMoremenupageMyreminderBtn() {
		return otriosMoremenupageMyreminderBtn;
	}

	public QAFWebElement getOtriosMoremenupageMyaccountBtn() {
		return otriosMoremenupageMyaccountBtn;
	}

	public QAFWebElement getOtriosMoremenupageHelpBtn() {
		return otriosMoremenupageHelpBtn;
	}

	public QAFWebElement getOtriosMoremenupageContactusBtn() {
		return otriosMoremenupageContactusBtn;
	}

	public QAFWebElement getOtriosMoremenupageLogoutBtn() {
		return otriosMoremenupageLogoutBtn;
	}

	public QAFWebElement getOtriosMoremenupageTermsofuseBtn() {
		return otriosMoremenupageTermsofuseBtn;
	}

	public QAFWebElement getOtriosMoremenupagePrivecypolicyBtn() {
		return otriosMoremenupagePrivecypolicyBtn;
	}

	public QAFWebElement getOtriosMoremenupageTermsofserviceBackBtn() {
		return otriosMoremenupageTermsofserviceBackBtn;
	}

	public QAFWebElement getOtriosMorepageStaticText(String text) {
		return JNJUtilsIOS.getElement("otrios.countryselectionPage.staticText.lbl", text);
	}
	
	public QAFWebElement getOtriosMoremenupageConnectionBtn() {
		return otriosMoremenupageConnectionBtn;
	}
	public QAFWebElement getOtriosMorepageStaticTextlbl(String text) {
		return JNJUtilsIOS.getElement("otrios.Moremenupage.staticText.lbl", text);
	}
	public QAFWebElement getOtriosMorepageaddOffceCodeBox(String text) {
		return JNJUtilsIOS.getElement("otrios.Moremenupage.connection.addofficeEnterCode.box", text);
	}
	public QAFWebElement getotriosMoremenuPageReminderNameTxt(String text) {
		return JNJUtilsIOS.getElement("otrios.MoremenuPage.reminder.name.txt", text);
	}
	public QAFWebElement getotriosMoremenupageReminderSynToggleBtn() {
		return otriosMoremenupageReminderSynToggleBtn;
	}
	public QAFWebElement getotriosMoremenupageReminderDoneBtn() {
		return otriosMoremenupageReminderDoneBtn;
	}
	public QAFWebElement getOtriosMoremenupageRemindercontinueBtn() {
		return JNJUtilsIOS.getElement("otrios.Moremenupage.staticText.lbl",JNJUtilsIOS.getPropString("alerts.meterTargetRangeDifferenceConfirmation.continue"));
	}
	
	/*
	 * Method to verify elements in more menu milan
	 */
	public void verifyMoreMenu() {
		getOtriosMoremenupageMysettingBtn().waitForPresent();
		getOtriosMoremenupageMysettingBtn().verifyPresent("Setting Label");
		getOtriosMoremenupageMymeterBtn().verifyPresent("My meter label");
		getOtriosMoremenupageMyreminderBtn().verifyPresent("My Reminder label");
		getOtriosMoremenupageMyaccountBtn().verifyPresent("My account label");
		getOtriosMoremenupageConnectionBtn().verifyPresent("Connections label");
		getOtriosMoremenupageHelpBtn().verifyPresent("Help lable");
		getOtriosMoremenupageContactusBtn().verifyPresent("Contact us label");
		getOtriosMoremenupageLogoutBtn().verifyPresent("Logout label");
		getOtriosMoremenupageTermsofuseBtn().verifyPresent("Terms of use label");
		getOtriosMoremenupagePrivecypolicyBtn().verifyPresent("Privacy policy label");
		
		
	}

	public void clickMySetting(){
		 getOtriosMoremenupageMysettingBtn().waitForPresent();
		 getOtriosMoremenupageMysettingBtn().click();
		 Reporter.logWithScreenShot("Setting Button Present", MessageTypes.Pass);
			
	}
	// Method to click and verify Privacy policy screen
	// milan
	public void clickAndVerifyPrivecyPilicyScreen() {
		getOtriosMoremenupagePrivecypolicyBtn().waitForPresent();
		getOtriosMoremenupagePrivecypolicyBtn().click();

		Reporter.logWithScreenShot("Privacy policy screen1", MessageTypes.Pass);
		JNJUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
		JNJUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("Privacy policy screen2", MessageTypes.Pass);
		JNJUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
		JNJUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("Privacy policy screen3", MessageTypes.Pass);
		JNJUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
		JNJUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("Privacy policy screen4", MessageTypes.Pass);
		JNJUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
		JNJUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("Privacy policy screen5", MessageTypes.Pass);
		JNJUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
		JNJUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("Privacy policy screen6", MessageTypes.Pass);
		JNJUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
		JNJUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("Privacy policy screen7", MessageTypes.Pass);
		ToClickBackBtn2();
		getOtriosMoremenupageMysettingBtn().verifyPresent("More menu screen");

	}

	// Method to click and verify Privacy Terms of use screen
	// milan
	public void clickAndVerifyTermsOfUseScreen() {
		getOtriosMoremenupageTermsofuseBtn().waitForPresent();
		getOtriosMoremenupageTermsofuseBtn().click();
		
		Reporter.logWithScreenShot("Terms of use screen 1", MessageTypes.Pass);
		JNJUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
		JNJUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("Terms of use screen 2", MessageTypes.Pass);
		JNJUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
		JNJUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("Terms of use screen 3", MessageTypes.Pass);
		JNJUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
		JNJUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("Terms of use screen 3", MessageTypes.Pass);
		JNJUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
		JNJUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("Terms of use screen 4", MessageTypes.Pass);
		JNJUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
		JNJUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("Terms of use screen 5", MessageTypes.Pass);
		JNJUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
		JNJUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("Terms of use screen 6", MessageTypes.Pass);
		JNJUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
		JNJUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("Terms of use screen 7", MessageTypes.Pass);
		ToClickBackBtn2();
//		getOtriosMoremenupageTermsofserviceBackBtn().click();
		getOtriosMoremenupageMysettingBtn().verifyPresent("More menu screen");

	}

	// Method to click on Contact Us menu from More menu
	public void clickContactUsPage() {
		getOtriosMoremenupageContactusBtn().waitForPresent();
		getOtriosMoremenupageContactusBtn().click();
	}

	// user verify contact us screen
	// milan
	public void verifyContactUsScreen() {
		getOtriosMoremenuPageContactUsTitleLbl().waitForPresent();
		getOtriosMoremenuPageContactUsTitleLbl().verifyPresent("contact us title");
		getOtriosMoremenuPageContactEmailLbl().verifyPresent("contact Email ");
		getOtriosMoremenuPageContactNumberLbl().verifyPresent("Contact Number");
		getOtriosMoremenuPageContactSiteLbl().verifyPresent("Contact Site");
		getOtriosMoremenuPageRateThisAppLbl().verifyPresent("Rate this app");

	}

	// Method to click on email to verify
	public void clickEmailToVerify() {
		getOtriosMoremenuPageContactEmailLbl().click();
		waitForPageToLoad();
		Reporter.logWithScreenShot("Email options in IOS", MessageTypes.Pass);
		getOtriosMoremenupageConnectionAddofficecancelBtn().click();
		Reporter.logWithScreenShot("After clicking cancel button", MessageTypes.Pass);
		
		if(getOtriosMoremenupageContactusDeleteDraftBtn().isPresent()){
			getOtriosMoremenupageContactusDeleteDraftBtn().click();
		}else if(JNJUtilsIOS.tryMethod(getOtriosMoremenupageConnectionAddofficedeletedraftBtn())){
			getOtriosMoremenupageConnectionAddofficedeletedraftBtn().click();
		}
		
	}

	// Method to click on logout button on more menu screen
	// milan
	public void clickonLogoutBtn() {
		getOtriosMoremenupageLogoutBtn().waitForPresent();
		getOtriosMoremenupageLogoutBtn().click();
		Reporter.logWithScreenShot("After clicking on logout", MessageTypes.Pass);
	}

	// Method to verify meter screen
	// milan
	public void verifyMyMeterScreen() {

		getOtriosMoremenuMyMeterAutoUpdateTimeLbl().verifyPresent("Auto Update Time label");
		getOtriosMoremenuMyMeterAutoUpdateTimeBtn().verifyPresent("Auto Update Time button");
		getOtriosMoremenuMyMeterPairMeterBtn().verifyPresent("Pair my meter button");
	}

	// method to click on reminder button form more menu screen
	// milan
	public void clickOnReminderFromMoreMenu() {
		getOtriosMoremenupageMyreminderBtn().waitForPresent();
		getOtriosMoremenupageMyreminderBtn().click();
		Reporter.logWithScreenShot("After clicking on reminder in more menu screen", MessageTypes.Pass);
	}


	// Method to verify set reminder screen
	// milan
	public void verifySetReminderScreen(String reminderType) {
		getOtriosMoremenupageReminderSetReminderlbl().waitForPresent();
		getOtriosMoremenupageReminderSetReminderlbl().verifyPresent("Set reminder title");
		WebDriverTestCase.verifyTrue(getOtriosMorepageStaticText(reminderType).isPresent(), "Reminder name incorrect",
				"Reminder name title correct");
		getOtriosMoremenupageReminderDateTimeBtn().verifyPresent("Date and time");
		getOtriosMoremenupageReminderRepeatBtn().verifyPresent("Reminder repeat");
	}

	// method to select date and time picker
	public void selectDateTimePicker() {
		Point p1 = getOtriosMoremenupageReminderDatePicker().getLocation();
		Dimension d1 = getOtriosMoremenupageReminderDatePicker().getSize();
		JNJUtilsIOS jnj = new JNJUtilsIOS();
		jnj.getDriver().tap(1, p1.getX() + d1.getWidth(), p1.getY() + ((d1.getHeight()) / 2) + 70, 500);
		int hour = Integer.parseInt(ConfigurationManager.getBundle().getProperty("reminder.hour").toString());
		int minute = Integer.parseInt(ConfigurationManager.getBundle().getProperty("reminder.minute").toString());
		selectTimePicker(getOtriosMoremenupageReminderHourPicker(), hour);
		selectTimePicker(getOtriosMoremenupageReminderMinutePicker(), minute);
		getotriosMoremenupageReminderDoneBtn().waitForPresent();//Sangram
		getotriosMoremenupageReminderDoneBtn().click();//Sangram
		Reporter.logWithScreenShot("Set date and time", MessageTypes.Pass);
	}

	// method to select date time picker
	// milan
	public void selectTimePicker(WebElement element, int value) {
		Point p1 = element.getLocation();
		Dimension d1 = element.getSize();
		JNJUtilsIOS jnj = new JNJUtilsIOS();
		int hr = Integer.parseInt(element.getAttribute("value").toString().replaceAll("[^0-9]", ""));
		if (hr >= value) {
			while (!(element.getAttribute("value").toString().replaceAll("[^0-9]", "").equals(value + ""))) {
				try {
					jnj.getDriver().tap(1, p1.getX() + d1.getWidth(), p1.getY() + ((d1.getHeight()) / 2) - 70, 500);
				} catch (Exception e) {
				}
			}
		}

		if (hr < value) {
			while (!(element.getAttribute("value").toString().replaceAll("[^0-9]", "").equals(value + ""))) {
				try {

					jnj.getDriver().tap(1, p1.getX() + d1.getWidth(), p1.getY() + ((d1.getHeight()) / 2) + 70, 500);
				} catch (Exception e) {
				}
			}
		}
	}

	// method to verify added reminder
	// milan
	public void verifyAddedReminder() {
		String hour = ConfigurationManager.getBundle().getProperty("reminder.hour").toString();
		String minute = ConfigurationManager.getBundle().getProperty("reminder.minute").toString();
		WebDriverTestCase.verifyTrue(
				getOtriosMoremenupageReminderSaveTiminglbl().getAttribute("label").toString().contains(hour),
				"Hour value is incorrect", "Hour value is correct");
		WebDriverTestCase.verifyTrue(
				getOtriosMoremenupageReminderSaveTiminglbl().getAttribute("label").toString().contains(minute),
				"Minute value is incorrect", "Minute value is correct");
		WebDriverTestCase.verifyTrue(
				getOtriosMorepageStaticTextlbl(ConfigurationManager.getBundle().getString("more.reminder.repeat").toString())
						.isPresent(),
				"Repeat value is incorrect", "Repeat value is correct");

	}

	// method to add a new reminder type
	// milan
	public void addNewReminderType() {
		String text = "New remidnerType";
		clickOnReminderFromMoreMenu();
		clickOnAddicon();
		clickOnNewReminderBtn();
		verifyAddRminderTypeScreen();
		getOtriosMoremenupageReminderAddreminderFieldTxt().sendKeys(text);
		ClickSaveBtn();
		getOtriosMorepageStaticText(text);
		WebDriverTestCase.verifyTrue(getOtriosMorepageStaticText(text).isPresent(), "Added new reminder not saved",
				"Added new reminder type");

	}

	// method to click on add icon for reminder
	// milan
	public void clickOnAddicon() {
		getOtriosMoremenuReminderAddBtn().waitForPresent();
		getOtriosMoremenuReminderAddBtn().click();
		Reporter.logWithScreenShot("After clicking on + icon", MessageTypes.Pass);

	}

	// method to click on add icon for reminder
	// milan
	public void clickOnNewReminderBtn() {
		getOtriosMoremenupageReminderNewReminderBtn().waitForPresent();
		getOtriosMoremenupageReminderNewReminderBtn().click();
		Reporter.logWithScreenShot("After clicking new reminder button", MessageTypes.Pass);

	}

	// method to click on add icon for reminder
	// milan
	public void verifyAddRminderTypeScreen() {
		getOtriosMoremenupageReminderAddReminderlbl().waitForPresent();
		getOtriosMoremenupageReminderAddReminderlbl().verifyPresent("Add reminder title");
		getOtriosMoremenupageReminderAddreminderFieldTxt().verifyPresent("Add new reminder name text field");
		getOtriosMoremenupageReminderAddReminderTypeBackBtn().get(0).verifyPresent("Back button");
		getOtriosMoremenupageReminderSaveBtn().get(0).verifyPresent("Save button");

	}

	// method to click on add icon for reminder
	// milan
	public void ClickSaveBtn() {
		getOtriosMoremenupageReminderSaveBtn().get(0).waitForPresent();
		for (QAFWebElement ele : getOtriosMoremenupageReminderSaveBtn()) {
			if (JNJUtilsIOS.tryMethod(ele))
				ele.click();
		}
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);

	}

	// method to click on add icon for reminder
	// milan
	public void ToClickBackBtn() {
		getOtriosMoremenupageReminderAddReminderTypeBackBtn().get(0).waitForPresent();
		for (QAFWebElement ele : getOtriosMoremenupageReminderAddReminderTypeBackBtn()) {
			if (JNJUtilsIOS.tryMethod(ele))
				ele.click();
		}
		Reporter.logWithScreenShot("After clicking on back button", MessageTypes.Pass);
	}
	public void ToClickBackBtn2() {
		getOotriosMoremenupagebackndBtn().get(0).waitForPresent();
		for (QAFWebElement ele : getOotriosMoremenupagebackndBtn()) {
			if (JNJUtilsIOS.tryMethod(ele))
				ele.click();
		}
		
	}

	// method to set repeat picker
	// milan
	public void setRepeatPicker() {
		getOtriosMoremenupageReminderRepeatPicker().waitForPresent();
		for(int i=0;i<getOtriosMoremenupageReminderRepeatPickerList().size();i++){
			if(JNJUtilsIOS.tryMethod( getOtriosMoremenupageReminderRepeatPickerList().get(i)) ){
				 getOtriosMoremenupageReminderRepeatPickerList().get(i)
				 .sendKeys(ConfigurationManager.getBundle().getString("reminder.types.daily").toString());
				 getotriosMoremenupageReminderDoneBtn().click();//Sangram
				 break;
			}
		}
		
	}

	// Method to verify all pages off reminder flow
	// milan
	public void verifyReminderScreens() {
		clickOnReminderFromMoreMenu();
		verifyRemindersScreen();
		clickOnAddicon();
		verifyChooseReminderScreen();
		getOtriosMorepageStaticText(JNJUtilsIOS.getPropString("reminder.preset.perform.glucose.test")).click();
		try {
			getOtriosMoremenupageReminderAlertOkBtn().waitForPresent(5000);
			getOtriosMoremenupageReminderAlertOkBtn().click();
		} catch (Exception e) {
		}
		verifySetReminderScreen(JNJUtilsIOS.getPropString("reminder.preset.perform.glucose.test"));
		ToClickBackBtn();
		getOtriosMoremenupageReminderChooseReminderlbl().waitForPresent();
		getOtriosMoremenupageReminderChooseReminderlbl()
				.verifyPresent("After clicking back button Choose reminder screen");
		clickOnNewReminderBtn();
		getOtriosMoremenupageReminderAddReminderlbl().verifyPresent("Add reminder title");
		ToClickBackBtn();
		getOtriosMoremenupageReminderChooseReminderlbl().waitForPresent();
		getOtriosMoremenupageReminderChooseReminderlbl()
				.verifyPresent("After clicking back button Choose reminder screen");
		ToClickBackBtn();
		//getOtriosMoremenupageRemindersTitle().verifyPresent("After clicking back button Reminders screen");
		ToClickBackBtn();
		getOtriosMorepageStaticTextlbl(JNJUtilsIOS.getPropString("more.title")).waitForPresent();
		getOtriosMorepageStaticTextlbl(JNJUtilsIOS.getPropString("more.title")).verifyPresent("After clicking back button More menu screen");
	}

	// Method to verify "Reminders" screen
	// Milan
	public void verifyRemindersScreen() {
		//getOtriosMoremenupageRemindersTitle().waitForPresent();
		//getOtriosMoremenupageRemindersTitle().verifyPresent("Reminder title");
		getOtriosMoremenuReminderAddBtn().verifyPresent("Add icon");
		getOtriosMoremenupageReminderAddReminderTypeBackBtn().get(0).verifyPresent("Back button");
	}

	// Method to verify "Choose reminder" screen
	// Milan
	public void verifyChooseReminderScreen() {
		getOtriosMoremenupageReminderNewReminderBtn().waitForPresent();
		getOtriosMoremenupageReminderChooseReminderlbl().verifyPresent("Choose reminder title");
		getOtriosMoremenupageReminderNewReminderBtn().verifyPresent("New Reminder button");
		getOtriosMoremenupageReminderAddReminderTypeBackBtn().get(0).verifyPresent("Back button");
		getotriosMoremenuPageReminderNameTxt(
				ConfigurationManager.getBundle().getString("reminder.preset.perform.glucose.test"))
						.verifyPresent("Perform a glucose test reminder is present");
		getotriosMoremenuPageReminderNameTxt(ConfigurationManager.getBundle().getString("reminder.preset.eat.snack"))
				.verifyPresent("Eat a snack reminder is present");
		getotriosMoremenuPageReminderNameTxt(ConfigurationManager.getBundle().getString("reminder.preset.eat"))
				.verifyPresent("Eat reminder is present");
		getotriosMoremenuPageReminderNameTxt(ConfigurationManager.getBundle().getString("reminder.preset.activity"))
				.verifyPresent("Activity reminder is present");
		getotriosMoremenuPageReminderNameTxt(ConfigurationManager.getBundle().getString("reminder.preset.buy.strips"))
				.verifyPresent("Buy strips reminder is present");
		getotriosMoremenuPageReminderNameTxt(ConfigurationManager.getBundle().getString("reminder.preset.bolus"))
				.verifyPresent("Bolus reminder is present");
		getotriosMoremenuPageReminderNameTxt(
				ConfigurationManager.getBundle().getString("reminder.preset.take.medication"))
						.verifyPresent("Take medication reminder is present");
		getotriosMoremenuPageReminderNameTxt(ConfigurationManager.getBundle().getString("reminder.preset.sync.reading"))
				.verifyPresent("Open OneTouch Reveal® app to sync readings reminder is present");

	}

	// Method to call customer care help desk
	public void callCustomerCare() {
		getOtriosMoremenuPageContactNumberLbl().click();
		Reporter.logWithScreenShot("Calling Screen", MessageTypes.Pass);
		// To Do
		ToClickBackBtn();
	}

	// Method to visit Customer Application Site
	public void visitApplicationSite() {
		getOtriosMoremenuPageContactSiteLbl().click();
		getOtriosMoremenupageContactusReturnBtn().waitForPresent();
		Reporter.logWithScreenShot("Application Website", MessageTypes.Pass);
		getOtriosMoremenupageContactusReturnBtn().click();
	}

	// Method to rate application on Apple Store
	public void rateApplication() {
		getOtriosMoremenuPageRateThisAppLbl().waitForPresent();
		getOtriosMoremenuPageRateThisAppLbl().click();
		getOtriosMoremenupageRateappBackBtn().waitForPresent();
		Reporter.logWithScreenShot("After clicking rate this app", MessageTypes.Pass);
	}

	// Method To Open My Meters Page
	public void clickMyMeters() {
		getOtriosMoremenupageMymeterBtn().waitForPresent();
		getOtriosMoremenupageMymeterBtn().click();
		JNJUtilsIOS.pause(1000);
		Reporter.logWithScreenShot("My meter screen");
	}
	// Method To Open My Account Page
	public void clickMyAccount() {
		getOtriosMoremenupageMyaccountBtn().waitForPresent();
		getOtriosMoremenupageMyaccountBtn().click();
	}
	//Method to verify time update switch off by default and then enable
	public void timeUpdate() {
		Boolean timeChangeSwitch = otriosMoremenuMyMeterAutoUpdateTimeBtn.isSelected();
		if(timeChangeSwitch == true) {
			Reporter.logWithScreenShot("Time Switch On by Default");
		}else {
			getOtriosMoremenuMyMeterAutoUpdateTimeBtn().click();
			otriosMoremenuMyMeterAutoUpdateTimeBtn.isSelected();
		}
		timeChangeSwitch.compareTo(timeChangeSwitch);
		Reporter.logWithScreenShot("Time Switch Turned on by User");
		
	}
	
	//Method to open connections page
	public void clickConnections() {
		getOtriosMoremenupageConnectionBtn().waitForPresent();
		getOtriosMoremenupageConnectionBtn().click();
		getOtriosMoremenupageConnectionApplehealthLbl().waitForPresent();
		Reporter.logWithScreenShot("After clicking on connection switch",MessageTypes.Pass);
	}
	//Method to click and open Help page
		public void clickHelpOption() {
			getOtriosMoremenupageHelpBtn().waitForPresent();
			getOtriosMoremenupageHelpBtn().click();
		}
	
	//Method to verify Connections page UI
	public void verifyConnetionsPage() {
		getOtriosMoremenupageConnectionApplehealthLbl().verifyPresent("Apple helth label");
		getOtriosMoremenupageConnectionApplehealthSwch().verifyPresent("Apple health switch");
		getOtriosMoremenupageConnectionAddofficeBtn().verifyPresent("Add clinic button");
		getOtriosMoremenupageTermsofserviceBackBtn().verifyPresent("Terms of service back button");
		//getOtriosMorepageStaticTextlbl(JNJUtilsIOS.getPropString("healthKit.enable.sharing.info")).verifyPresent("Apple health message");
		getOtriosMorepageStaticTextlbl(JNJUtilsIOS.getPropString("offices.instructions")).verifyPresent("Add office message");
		
		getOtriosMoremenupageTermsofserviceBackBtn().click();
		getOtriosMoremenupageMysettingBtn().verifyPresent("After clicking back setting screen");
		
		
	}
	
	//Method to verify More Menu header
	public void verifyMoreMenuHeader() {
		getOtriosMorepageStaticTextlbl(JNJUtilsIOS.getPropString("more.title")).verifyPresent("More Menu Header is present");
	}
	//Method to select apple health toggle switch
	public void ToogleAppleHealthSwtch(){
		getOtriosMoremenupageConnectionApplehealthSwch().waitForPresent();
		if(getOtriosMoremenupageConnectionApplehealthSwch().getAttribute("value").contains("0")){
			getOtriosMoremenupageConnectionApplehealthSwch().click();
			
			if(getOtriosMorepageStaticTextlbl(ConstantUtils.APPLEHEALTH_POPUP_MSG).isPresent())
			{
				Reporter.logWithScreenShot("Apple health pop up", MessageTypes.Pass);
				getOtriosMorepageStaticTextlbl("Enable Now").click();
			}
			Reporter.logWithScreenShot("After clicking switch", MessageTypes.Pass);
		}
		else{
			Reporter.logWithScreenShot("Switch is already on", MessageTypes.Pass);
		}
		
	}
	//Method to verify incorrect office code
	public void incorrectClinicCode(){
		getOtriosMoremenupageConnectionAddofficeBtn().click();
		getOtriosMoremenupageConnectionAddofficeentercodeLbl().waitForPresent();
		getOtriosMorepageaddOffceCodeBox("1").sendKeys("abcdef");
		getOtriosMoremenupageConnectionAddofficesearchBtn().click();
		Reporter.logWithScreenShot("After clicking search", MessageTypes.Pass);
		getOtriosMorepageStaticTextlbl(JNJUtilsIOS.getPropString("office.code.not.found")).verifyPresent("Office code error message");
	}
	//Method to verify incorrect office code
	public void incorrectClinicCodeFormat(){
		
	
		getOtriosMoremenupageConnectionAddofficeBtn().click();
		getOtriosMoremenupageConnectionAddofficeentercodeLbl().waitForPresent();
		getOtriosMorepageaddOffceCodeBox("1").verifyPresent("Clinic code text box");
		getOtriosMorepageaddOffceCodeBox("1").sendKeys("123456");
		WebDriverTestCase.verifyTrue(!getOtriosMorepageaddOffceCodeBox("1").getAttribute("value").contains("1"), "Able to enter numeric value",
					"Numeric value not allowed");
			
	}
	//Method verify connecting with valid office code
	//milan
	public void validClinicCode(Object userDetail){
		
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		getOtriosMoremenupageConnectionAddofficeBtn().click();
		getOtriosMoremenupageConnectionAddofficeentercodeLbl().waitForPresent();
		getOtriosMorepageaddOffceCodeBox("1").verifyPresent("Clinic code text box");
		getOtriosMorepageaddOffceCodeBox("1").sendKeys(userBean.getClinicCode());
		getOtriosMoremenupageConnectionAddofficesearchBtn().click();
		
		getOtriosMoremenupageConnectionOfficereenterBtn().verifyPresent("Recent button");
		getOtriosMoremenupageConnectionOfficeyesBtn().verifyPresent("Yes button");
		getOtriosMoremenupageConnectionOfficeqstLbl().verifyPresent("Is this your office question");
		WebDriverTestCase.verifyTrue(getOtriosMoremenupageConnectionOfficenameLbl().getAttribute("label").contains(userBean.getOfficName()), "Incorrect office name",
				"Correct Office name");
	//	WebDriverTestCase.verifyTrue(getOtriosMoremenupageConnectionOfficecontactLbl().getAttribute("label").replaceAll("[^0-9]", "").contains(userBean.getOfficeNumber()), "Incorrect office number",
	//			"Correct Office number");
		getOtriosMoremenupageConnectionOfficereenterBtn().click();
		WebDriverTestCase.verifyTrue(!getOtriosMorepageaddOffceCodeBox("1").getAttribute("value").contains(userBean.getClinicCode().substring(0, 1)), "After clicking reenter button previous office code displaying",
				"After clicking reenter button previous office code not displaying");
		
		getOtriosMorepageaddOffceCodeBox("1").sendKeys(userBean.getClinicCode());
		getOtriosMoremenupageConnectionAddofficesearchBtn().click();
		getOtriosMoremenupageConnectionOfficeyesBtn().verifyPresent("Yes button");
		getOtriosMoremenupageConnectionOfficeyesBtn().click();
		getOtriosMoremenupageConnectionAddofficeBtn().waitForPresent();
		getOtriosMoremenupageConnectionCheckboxLbl().verifyPresent("Accept office screen");
		getOtriosMoremenupageConnectionCheckboxLbl().click();
		getOtriosMoremenupageConnectionDoneBtn().click();
		getOtriosMoremenupageConnectionRequestsubmitedLbl().waitForPresent();
		getOtriosMoremenupageConnectionRequestsubmitedLbl().verifyPresent("Connection request submited lable");
		getOtriosMoremenupageConnectionWithdrawrequestBtn().verifyPresent("Withdraw connection button");
		getOtriosMoremenupageConnectionWithdrawrequestBtn().click();
		
		
			
	}

	//Method to set Reminder for all options available
	public void setSnackReminder(String option) {
		clickOnReminderFromMoreMenu();
		clickOnAddicon();
		getOtriosMorepageStaticText(option).click();
		try {
			getOtriosMoremenupageReminderAlertOkBtn().waitForPresent(5000);
			getOtriosMoremenupageReminderAlertOkBtn().click();
		} catch (Exception e) {
		}
			
		verifySetReminderScreen(option);
		getOtriosMoremenupageReminderDateTimeBtn().click();
		selectDateTimePicker();
		getOtriosMoremenupageReminderRepeatBtn().click();
		setRepeatPicker();
		ClickSaveBtn();
		getOtriosMorepageStaticText(option).waitForPresent();
		getOtriosMorepageStaticText(option).click();
		verifyAddedReminder();
		getOtriosMorepageStaticText(ConfigurationManager.getBundle().getString("appCommon.delete")).click();
		getOtriosMoremenupageReminderDeteletPopUpDeleteBtn().click();

			
	}
	//Method to check walgreen user
	//Milan
	public void verifyWalgreenUserSwitch(){
		getOtriosMoremenupageConnectionWalgreenSwitch().waitForPresent();
		getOtriosMoremenupageConnectionWalgreenSwitch().verifyPresent("Walgreen switch");
		Validator.verifyThat("Walgreen switch is on",getOtriosMoremenupageConnectionWalgreenSwitch().
				getAttribute("value"),Matchers.equalTo("1"));
	}
	//Method to check walgreen user disconnect flow
	//Milan
	public void verifyWalgreenUserSwitchOff(){
		getOtriosMoremenupageConnectionWalgreenSwitch().waitForPresent();
		if(getOtriosMoremenupageConnectionWalgreenSwitch().getAttribute("value").contains("1")){
			Validator.verifyThat("Walgreeb switch ",getOtriosMoremenupageConnectionWalgreenSwitch().
					getAttribute("value"),Matchers.equalTo("1"));
			Reporter.logWithScreenShot("For walgreen user walgreen switch is on", MessageTypes.Pass);
			getOtriosMoremenupageConnectionWalgreenSwitch().click();
			//todo verify walgreen unlink popup
			getOtriosMorepageStaticTextlbl(JNJUtilsIOS.getPropString("alerts.attention.title")).waitForPresent();
			getOtriosMorepageStaticTextlbl(JNJUtilsIOS.getPropString("appCommon.cancel")).verifyPresent("pop up cancel button");
			getOtriosMorepageStaticTextlbl(JNJUtilsIOS.getPropString("appCommon.disconnect")).verifyPresent("pop up disconnect button");
			Reporter.logWithScreenShot("Walgreen pop up", MessageTypes.Pass);
			
			if(getOtriosMorepageStaticTextlbl(JNJUtilsIOS.getPropString("appCommon.cancel")).isPresent()){
				getOtriosMorepageStaticTextlbl(JNJUtilsIOS.getPropString("appCommon.cancel")).click();
			}
			Validator.verifyThat("Walgreeb switch should 1 after clicking on cancel button",getOtriosMoremenupageConnectionWalgreenSwitch().
					getAttribute("value"),Matchers.equalTo("1")); 
			
			getOtriosMoremenupageConnectionWalgreenSwitch().click();
			getOtriosMorepageStaticTextlbl(JNJUtilsIOS.getPropString("alerts.attention.title")).waitForPresent();
			getOtriosMorepageStaticTextlbl(JNJUtilsIOS.getPropString("appCommon.disconnect")).click();
			Validator.verifyThat("Walgreeb switch is OFF",getOtriosMoremenupageConnectionWalgreenSwitch().
					getAttribute("value"),Matchers.equalTo("0"));
		}else{
			Reporter.logWithScreenShot("For walgreen user walgreen switch is off", MessageTypes.Pass);
		}
		
		
		
	}
	//method to verify reminder type max allowed size
	//Milan
	public void verifyReminderTypeFieldMaxLength() {
		getOtriosMoremenupageRemindersTitle().waitForPresent();
		String typeName = RandomStringUtils.randomAlphanumeric(36);
		clickOnAddicon();
		clickOnNewReminderBtn();
		verifyAddRminderTypeScreen();
		getOtriosMoremenupageReminderAddreminderFieldTxt().clear();
		getOtriosMoremenupageReminderAddreminderFieldTxt().sendKeys(typeName);
		Validator.verifyThat("Reminder type length",getOtriosMoremenupageReminderAddreminderFieldTxt().
				getAttribute("value").length(),Matchers.lessThanOrEqualTo(35));
	}
	//Method to verify reminder
	public void verifydescriptionLengthAndReminderTimePast() {
		getOtriosMoremenupageRemindersTitle().waitForPresent();
		String typeName = RandomStringUtils.randomAlphanumeric(61);
		clickOnAddicon();
		getOtriosMorepageStaticText(JNJUtilsIOS.getPropString("reminder.preset.perform.glucose.test")).click();
		try {
			getOtriosMoremenupageReminderAlertOkBtn().waitForPresent(5000);
			getOtriosMoremenupageReminderAlertOkBtn().click();
		} catch (Exception e) {
		}
		getOtriosMoremenupageReminderReminderDescriptionTxt().waitForPresent();
		getOtriosMoremenupageReminderReminderDescriptionTxt().clear();
		getOtriosMoremenupageReminderReminderDescriptionTxt().sendKeys(typeName);
		Validator.verifyThat("Reminder description max allowed charcter",getOtriosMoremenupageReminderReminderDescriptionTxt().
				getAttribute("value").length(),Matchers.lessThanOrEqualTo(60));
		
		getOtriosMoremenupageReminderDateTimeBtn().click();
		Point p1 = getOtriosMoremenupageReminderDatePicker().getLocation();
		Dimension d1 = getOtriosMoremenupageReminderDatePicker().getSize();
		JNJUtilsIOS jnj = new JNJUtilsIOS();
		jnj.getDriver().tap(1, p1.getX() + d1.getWidth(), p1.getY() + ((d1.getHeight()) / 2) - 70, 500);
		JNJUtilsIOS.pause(1000);
		WebDriverTestCase.verifyTrue(getOtriosMoremenupageReminderDatePicker().getAttribute("value").contains("Today"), "Selecting past date",
				"picker now allowing Past date ");
		
		Point p2 = getOtriosMoremenupageReminderHourPicker().getLocation();
		Dimension d2 = getOtriosMoremenupageReminderHourPicker().getSize();
		String hour=getOtriosMoremenupageReminderDatePicker().getAttribute("value").replaceAll("[^0-9]", "");
		jnj.getDriver().tap(1, p2.getX() + d2.getWidth(), p2.getY() + ((d2.getHeight()) / 2) - 70, 500);
		JNJUtilsIOS.pause(1000);
		WebDriverTestCase.verifyTrue(getOtriosMoremenupageReminderDatePicker().getAttribute("value").contains(hour), "Selecting past hour",
				"picker now allowing Past hour ");
		
	}
	//reminder screen navigation
	public void reminderscreens(){
		
		getOtriosMoremenuReminderAddBtn().waitForPresent();
		Reporter.logWithScreenShot("reminder screen1", MessageTypes.Pass);
		getOtriosMoremenuReminderAddBtn().click();
		Reporter.logWithScreenShot("reminder screen2", MessageTypes.Pass);
		clickOnNewReminderBtn();
		Reporter.logWithScreenShot("reminder screen3", MessageTypes.Pass);
	
		if(JNJUtilsIOS.tryMethod(getOtriosMoremenupageReminderAddReminderTypeBackBtn().get(0))){
			ToClickBackBtn();
		}else if (getOotriosMoremenupagebackndBtn().get(0).isPresent()) {
			ToClickBackBtn2();
		}
		
		String eat=JNJUtilsIOS.getPropString("reminder.preset.eat");
		getOtriosMorepageStaticText(eat).click();
		
		try {
			getOtriosMoremenupageReminderAlertOkBtn().waitForPresent(5000);
			getOtriosMoremenupageReminderAlertOkBtn().click();
		} catch (Exception e) {
		}
		Reporter.logWithScreenShot("reminder screen5", MessageTypes.Pass);
		getOtriosMoremenupageReminderDateTimeBtn().click();
		Reporter.logWithScreenShot("reminder screen5", MessageTypes.Pass);
		getOtriosMoremenupageReminderRepeatBtn().click();
		getOtriosMoremenupageReminderRepeatBtn().click();
		Reporter.logWithScreenShot("reminder screen6", MessageTypes.Pass);
		ToClickBackBtn();
		ToClickBackBtn();
		
		
	}
	//Method to verify my setting screen
	public void mySettingScreen(){
		Reporter.logWithScreenShot("Setting screen1", MessageTypes.Pass);
		JNJUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
		JNJUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("Setting screen2", MessageTypes.Pass);
	}
	//Click and verify clinic code screen
	//milan
	public void clickAndVerifyClinicCodeScreen(){
		getOtriosMoremenupageConnectionAddofficeBtn().click();
		JNJUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("Setting screen2", MessageTypes.Pass);
		getOtriosMoremenupageConnectionAddofficecancelBtn().click();
	}
	//Method to connect a non walgreen user to walgreen
	//Milan
	public void addNonwalgreenUserToWalgreen(Object userDetails){
		
		disconnectWalgreenSwitch();
		
		String important=JNJUtilsIOS.getPropString("alerts.attention.title");
		String enableNow=JNJUtilsIOS.getPropString("appCommon.enableNow");
		Validator.verifyThat("Walgreeb switch ",getOtriosMoremenupageConnectionWalgreenSwitch().
				getAttribute("value"),Matchers.equalTo("0"));
		
		//to verify element on walgreen connect pop up
		getOtriosMoremenupageConnectionWalgreenSwitch().click();
		getOtriosMorepageStaticText(important).waitForPresent();
		getOtriosMoremenuPageConnectionWalgreenCancelBtn().verifyPresent("Cancel button");
		getOtriosMoremenuPageConnectionWalgreenEnableBtn().verifyPresent("Enable button");
		
		JNJUtilsIOS jnjios=new JNJUtilsIOS();
		Set<String> dr=jnjios.getDriver().getContextHandles();
		Iterator<String> It= dr.iterator();
	
 		String winHandle1= It.next();
		System.out.println(winHandle1);
		String winHandle2= It.next();
		System.out.println(winHandle2);
		String winHandle3= It.next();
		System.out.println(winHandle3);
		jnjios.getDriver().context(winHandle3);
		
		getOtriosMoremenuPageConnectionWalgreenTermLnk().verifyPresent("Term link on wlagreen enable pop up");
		getOtriosMoremenuPageConnectionWalgreenPrivecyLnk().verifyPresent("Privecy link on wlagreen enable pop up");
		
		getOtriosMoremenuPageConnectionWalgreenTermLnk().click();
		jnjios.getDriver().context(winHandle1);
		getOtriosMorepageStaticText(JNJUtilsIOS.getPropString("common.backbuttontext")).waitForPresent(3000);
		Reporter.logWithScreenShot("Terms of service page for walgeen connetion", MessageTypes.Pass);
		getOtriosMorepageStaticText(JNJUtilsIOS.getPropString("common.backbuttontext")).click();
		
		getOtriosMoremenupageConnectionWalgreenSwitch().waitForPresent(3000);
		getOtriosMoremenupageConnectionWalgreenSwitch().click();
		jnjios.getDriver().context(winHandle3);
		getOtriosMoremenuPageConnectionWalgreenPrivecyLnk().click();
		jnjios.getDriver().context(winHandle1);
		getOtriosMorepageStaticText(JNJUtilsIOS.getPropString("common.backbuttontext")).waitForPresent(3000);
		Reporter.logWithScreenShot("Privecy page for walgeen connetion", MessageTypes.Pass);
		getOtriosMorepageStaticText(JNJUtilsIOS.getPropString("common.backbuttontext")).click();
		
		getOtriosMoremenupageConnectionWalgreenSwitch().waitForPresent(3000);
		getOtriosMoremenupageConnectionWalgreenSwitch().click();
		getOtriosMorepageStaticText(important).waitForPresent();
		getOtriosMoremenuPageConnectionWalgreenCancelBtn().click();
		Validator.verifyThat("Walgreen switch 0 for OFF when clicking cancel button",getOtriosMoremenupageConnectionWalgreenSwitch().
				getAttribute("value"),Matchers.equalTo("0"));
		
		getOtriosMoremenupageConnectionWalgreenSwitch().click();
		getOtriosMorepageStaticText(important).waitForPresent();
		getOtriosMorepageStaticText(enableNow).verifyPresent("Wlagreen Term pop up");
		getOtriosMorepageStaticText(enableNow).click();

		JNJUtilsIOS.swipeWithCoordinates(476, 932, 443, 831, 10);
		signInIntoWalgreen(userDetails);
		
		getOtriosMoremenupageConnectionWalgreenSwitch().waitForPresent(5000);
		Validator.verifyThat("Walgreen switch 1 for ON",getOtriosMoremenupageConnectionWalgreenSwitch().
				getAttribute("value"),Matchers.equalTo("1"));
	}
	//Method to disconnect walgreen connection by switch off the walgreen switch
	public void disconnectWalgreenSwitch(){
		getOtriosMoremenupageConnectionWalgreenSwitch().waitForPresent(2000);
		
		if(getOtriosMoremenupageConnectionWalgreenSwitch().getAttribute("value").contains("1")){
			getOtriosMoremenupageConnectionWalgreenSwitch().click();
			getOtriosMorepageStaticTextlbl(JNJUtilsIOS.getPropString("appCommon.disconnect")).click();
			Reporter.logWithScreenShot("For walgreen user walgreen switch is off", MessageTypes.Pass);
		}
	}
	//Method to connect the user to the walgreen
	public void signInIntoWalgreen(Object userDetail){
		
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		JNJUtilsIOS jnjios=new JNJUtilsIOS();
		Set<String> dr=jnjios.getDriver().getContextHandles();
		Iterator<String> It= dr.iterator();
	
 		String winHandle1= It.next();
		System.out.println(winHandle1);
		String winHandle2= It.next();
		System.out.println(winHandle2);
		String winHandle3= It.next();
		System.out.println(winHandle3);
		jnjios.getDriver().context(winHandle3);
		
		Reporter.logWithScreenShot("Walgreen term page", MessageTypes.Pass);
		getOtriosMoremenupageConnectionWalgreenChk().click();
		
		getOtriosMoremenuPageConnectionWalgreenEmailTxt().waitForPresent(5000);
		getOtriosMoremenuPageConnectionWalgreenEmailTxt().sendKeys(userBean.getUsername());
		getOtriosMoremenuPageConnectionWalgreenPasswordTxt().sendKeys(userBean.getPassword());
		Reporter.logWithScreenShot("Entered Details", MessageTypes.Pass);
		getOtriosMoremenuPageConnectionWalgreenSigninBtn().click();
		try{
//			getOtriosMoremenuPageConnectionWalgreenYesBtn().waitForPresent();
			getOtriosMoremenuPageConnectionWalgreenYesBtn().click();
			Reporter.logWithScreenShot("after yes", MessageTypes.Pass);
		}catch(Exception e){
		}
		try{
//			getOtriosMoremenuPageConnectionWalgreenFinishBtn().waitForPresent();
			getOtriosMoremenuPageConnectionWalgreenFinishBtn().click();
			Reporter.logWithScreenShot("after finish", MessageTypes.Pass);
		}catch(Exception e){
		}
		jnjios.getDriver().context(winHandle1);
	}
	//Method to verify ohter country office code
	public void ohterCountryClinicCode(){
		getOtriosMoremenupageConnectionAddofficeBtn().click();
		getOtriosMoremenupageConnectionAddofficeentercodeLbl().waitForPresent();
		String clinicCode=ConfigurationManager.getBundle().getProperty("clinic.clinicCode.nl.code1").toString();
		getOtriosMorepageaddOffceCodeBox("1").sendKeys(clinicCode);
		getOtriosMoremenupageConnectionAddofficesearchBtn().click();
		getOtriosMorepageStaticTextlbl(JNJUtilsIOS.getPropString("office.code.not.found")).verifyPresent("Office code error message");
	}

	public void verifyToggleButton() {
		clickOnReminderFromMoreMenu();
		getotriosMoremenupageReminderSynToggleBtn().waitForPresent();
		Reporter.logWithScreenShot("Toggle button for Sync my readings is pesent", MessageTypes.Pass);
		if (getotriosMoremenupageReminderSynToggleBtn().getAttribute("enabled").equalsIgnoreCase("false")){
			getotriosMoremenupageReminderSynToggleBtn().click();
			Reporter.logWithScreenShot("Toggle button is clicked to ON ", MessageTypes.Pass);
		}
		else if(getotriosMoremenupageReminderSynToggleBtn().getAttribute("enabled").equalsIgnoreCase("true")){
			getotriosMoremenupageReminderSynToggleBtn().click();
			Reporter.logWithScreenShot("Toggle button is clicked to OFF ", MessageTypes.Pass);
		}

	}

	public void verifyToggleButtonDisabled() {
		clickOnReminderFromMoreMenu();
		getotriosMoremenupageReminderSynToggleBtn().waitForPresent();
		if (getotriosMoremenupageReminderSynToggleBtn().getAttribute("enabled").equalsIgnoreCase("false")) {
			Reporter.logWithScreenShot("Sync toggle button is disabled", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Sync toggle button is not disabled", MessageTypes.Fail);
		}
	}

	public void verifyToggleButtonON() {
		clickOnReminderFromMoreMenu();
		getotriosMoremenupageReminderSynToggleBtn().waitForPresent();
		if (getotriosMoremenupageReminderSynToggleBtn().getAttribute("value").equalsIgnoreCase("1")) {
			Reporter.logWithScreenShot("Sync toggle button is ON", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Sync toggle button is NOT on", MessageTypes.Fail);

		}
	}
	
	public void verifyRateUsLabel() {
		getOtriosMorepageStaticTextlbl(ConfigurationManager.getBundle().getString("rateUs.message")).waitForPresent();
		getOtriosMorepageStaticTextlbl(ConfigurationManager.getBundle().getString("rateUs.message"))
				.verifyPresent("Rate Us lable is present");

	}


	public void clickToPairMeter() {
		getOtriosMoremenuMyMeterAutoUpdateTimeLbl().waitForPresent();
		getOtriosMoremenuMyMeterPairMeterBtn().click();
		Reporter.logWithScreenShot("My Meter Connect page", MessageTypes.Pass);
		getOtriosMoremenupageMymeterVeriometerImg().verifyPresent("vario meter image");
		getOtriosMoremenupageMymeterVeriometerImg().click();
		getOtriosMoremenupageRemindercontinueBtn().waitForPresent();
		getOtriosMoremenupageRemindercontinueBtn().click();
		getOtriosMoremenupageRemindercontinueBtn().verifyPresent("Continue button to turn on Bluetooth is present");
		getOtriosMoremenupageRemindercontinueBtn().click();
		getOtriosMoremenupageConnectionAddofficecancelBtn().waitForPresent();
		Reporter.logWithScreenShot("Meter not found popup is displayed", MessageTypes.Pass);
		getOtriosMoremenupageConnectionAddofficecancelBtn().click();
	}

	public void navigateToHomepage() {
		
		new HomePageIOS().getOtriosHomepageHomeBtn().verifyPresent("Home page");
	}

}
