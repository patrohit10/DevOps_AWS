package com.lemonade.support;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Predicate;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.StringUtil;
import com.thoughtworks.selenium.SeleniumException;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class JNJUtilsAndroid {
	
	private AndroidDriver androidDriver = ((AndroidDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver());
	public  AndroidDriver getDriver() {
		//return  (IOSDriver)new WebDriverTestCase().getDriver().getUnderLayingDriver();
		return androidDriver;
	}

	/*
	 * This Method returns Current Month
	 */
	public static String getCurrentMonth() {
		Calendar cal = Calendar.getInstance();
		return new SimpleDateFormat("MMMMM").format(cal.getTime());
	}
	/*
	 * This Method returns Current Date
	 */
	public static String getCurrentDate() {
		Calendar cal = Calendar.getInstance();
		return new SimpleDateFormat("d", Locale.ENGLISH).format(cal.getTime());
	}

	/*
	 * This Method returns Current Day of Week
	 */
	public static String getDayOfWeek() {
		String weekdays[] = new DateFormatSymbols(Locale.ENGLISH).getWeekdays();
		Calendar c = Calendar.getInstance();
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		return weekdays[dayOfWeek];
	}

	/*
	 * Method is used to scroll screen till exact text
	 */
	@QAFTestStep(description = "scroll to {0}")
	public static void scrollToEleAndriod(String exactText) {
		try {
			AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver().getUnderLayingDriver());
			appiumDriver.scrollTo(exactText);
		} catch (SeleniumException e) {
			new WebDriverTestBase().getDriver().getTouchScreen().flick(0, (JNJUtilsAndroid.getIntNum("400")));
		}
	}

	/*
	 * Used for scroll to methods return int value
	 */
	public static Integer getIntNum(String num) {
		if (StringUtil.isNumeric(num)) {
			return Integer.parseInt(num);
		}
		return null;
	}

	/*
	 * method is used to hide the keyboard
	 */
	public static void hideKeyboard() {
		try {
			((AndroidDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver()).hideKeyboard();
		} catch (Exception e) {
		}
	}

	public static void swipeWithElements(QAFExtendedWebElement firstEle, QAFExtendedWebElement secondEle,
			Integer duration) {
		AndroidDriver androidDriver = (AndroidDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
		androidDriver.swipe(firstEle.getCoordinates().onPage().getX(), firstEle.getCoordinates().onPage().getY(),
				secondEle.getCoordinates().onPage().getX(), secondEle.getCoordinates().onPage().getY(),
				(JNJUtilsAndroid.getIntNum(duration.toString())));
	}

	/**
	 * Method is used to swipe by co-ordinates
	 */
	public static void swipeWithCoordinates(int startx, int starty, int endx, int endy, Integer duration) {
		AndroidDriver androidDriver = (AndroidDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
		androidDriver.swipe(startx, starty, endx, endy, (JNJUtilsAndroid.getIntNum(duration.toString())));
	}

	/**
	 * Method is used to wait till timeout mention in application.properties
	 * file
	 */
	public static void waitCondition(String locator, String waitType) {
		waitCondition(locator, waitType,
				Long.parseLong((String) ConfigurationManager.getBundle().getProperty("selenium.wait.timeout")));
	}

	/**
	 * Method is used to wait till timeout mention in application.properties
	 * file and till mention condition to be true
	 */
	public static void waitCondition(String locator, String waitType, long timeout) {
		WebDriverWait waitDriver = new WebDriverWait(new WebDriverTestCase().getDriver().getUnderLayingDriver(),
				(Long.parseLong((String) ConfigurationManager.getBundle().getProperty("selenium.wait.timeout")))
						/ 1000);
		waitDriver.pollingEvery(1000, TimeUnit.MILLISECONDS);

		switch (waitType.toUpperCase(Locale.ENGLISH)) {
		case "WAITFORPRESENT":
			QAFExtendedWebElement elementForWait = new QAFExtendedWebElement(locator);
			if (timeout <= 0) {
				elementForWait.waitForPresent(
						Long.parseLong((String) ConfigurationManager.getBundle().getProperty("selenium.wait.timeout")));
			} else {
				elementForWait.waitForPresent(timeout);
			}
			break;

		case "WAITFORNOTPRESENT":
			QAFExtendedWebElement elementForNotWait = new QAFExtendedWebElement(locator);
			if (timeout <= 0) {
				elementForNotWait.waitForNotPresent(
						Long.parseLong((String) ConfigurationManager.getBundle().getProperty("selenium.wait.timeout")));
			} else {
				elementForNotWait.waitForNotPresent(timeout);
			}
			break;

		case "EXPLICITWAITFORPRESENT":
			final QAFExtendedWebElement elementExForWait = new QAFExtendedWebElement(locator);
			waitDriver.until(new Predicate<WebDriver>() {
				@Override
				public boolean apply(WebDriver input) {
					return elementExForWait.isPresent();
				}
			});
			break;

		case "EXPLICITWAITFORNOTPRESENT":
			final QAFExtendedWebElement elementExForNotWait = new QAFExtendedWebElement(locator);
			waitDriver.until(new Predicate<WebDriver>() {
				@Override
				public boolean apply(WebDriver input) {
					return !elementExForNotWait.isPresent();
				}
			});
			break;

		default:
			break;
		}
	}

	/*
	 * method is used to return QAFWebElement appending text inside locator
	 */
	public static QAFWebElement getElement(String locKey, String eleText) {
		QAFWebElement buttonEle = new QAFExtendedWebElement(
				String.format(ConfigurationManager.getBundle().getString(locKey), eleText, eleText));
		return buttonEle;
	}

	public static void waitforLoad() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/* Method to click back button on Android Device */
	public static void clickBackButton() {
		try {
			AndroidDriver androidDriver = (AndroidDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
			androidDriver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean tryDisplayMethod(QAFWebElement element){
		boolean flag=false;
		try{
			if((element.isDisplayed()))
				flag=true;
		}
		catch(Exception e){
			
		}
		return flag;
		
	}
	
	public static String monthIntValue(String month){
		
		HashMap<String, String> monthmap = new HashMap<String, String>();
		monthmap.put("Jan", "1");monthmap.put("1", "Jan");
		monthmap.put("Feb", "2");monthmap.put("2", "Feb");
		monthmap.put("Mar", "3");monthmap.put("3", "Mar");
		monthmap.put("Apr", "4");monthmap.put("4", "Apr");
		monthmap.put("May", "5");monthmap.put("5", "May");
		monthmap.put("Jun", "6");monthmap.put("6", "Jun");
		monthmap.put("Jul", "7");monthmap.put("7", "Jul");
		monthmap.put("Aug", "8");monthmap.put("8", "Aug");
		monthmap.put("Sep", "9");monthmap.put("9", "Sep");
		monthmap.put("Oct", "10");monthmap.put("10", "Oct");
		monthmap.put("Nov", "11");monthmap.put("11", "Nov");
		monthmap.put("Dec", "12");monthmap.put("12", "Dec");
		return monthmap.get(month);
	}

	public static String monthNoOFDay(String month) {

		HashMap<String, String> monthmap = new HashMap<String, String>();
		monthmap.put("Jan", "31");
		monthmap.put("Feb", "28");
		monthmap.put("Mar", "31");
		monthmap.put("Apr", "30");
		monthmap.put("May", "31");
		monthmap.put("Jun", "30");
		monthmap.put("Jul", "31");
		monthmap.put("Aug", "31");
		monthmap.put("Sep", "30");
		monthmap.put("Oct", "31");
		monthmap.put("Nov", "30");
		monthmap.put("Dec", "31");
		return monthmap.get(month);
	}

	public static boolean tryMethod(QAFWebElement element){
		boolean flag=false;
		try{
			if((element.isDisplayed()))
				flag=true;
		}
		catch(Exception e){
			
		}
		return flag;
		
	}
	public static void selectPicker(WebElement element,int value)
	{
		Point p1=element.getLocation();
		Dimension d1 =element.getSize();
		JNJUtilsAndroid jnj=new JNJUtilsAndroid();
		int hr = Integer.parseInt(element.getText().toString().replaceAll("[^0-9]", ""));
		if (hr >= value) {
			while (!(Integer.parseInt(element.getText().toString().replaceAll("[^0-9]", ""))==value)) {
				try {
					jnj.getDriver().tap(1, p1.getX()+ (d1.getWidth()/2), p1.getY() + ((d1.getHeight())/2)-130, 500);
				} catch (Exception e) {
				}
			}	
		}
		
		if (hr < value) {
			while (!(Integer.parseInt(element.getText().toString().replaceAll("[^0-9]", ""))==value)) {
				try {
					jnj.getDriver().tap(1, p1.getX()+ (d1.getWidth()/2), p1.getY() + ((d1.getHeight())/2)+130, 500);
				} catch (Exception e) {
				}
			}	
		}
	}
	
	public static QAFWebElement getElement(String locKey, String eleText,String eleText2) {
		QAFWebElement buttonEle = new QAFExtendedWebElement(
				String.format(ConfigurationManager.getBundle().getString(locKey), eleText, eleText2));
		return buttonEle;
	}
	
	//Method to get string from config file
	 public static String getPropString(String key){
	  return ConfigurationManager.getBundle().getProperty(key).toString();
	 }
	
	
}
