package com.lemonade.version3.iOS.beans;

import com.qmetry.qaf.automation.data.BaseDataBean;

public class EventDetailBeans extends BaseDataBean{
	
	String amount;
    String unit;
    String hour;
    String miunute;
    String meredian;
    String mealTag;
    String insulinType;
    String activityType;
    String lowestGlucosValue;
    String highstGlucosValue;
    
    
	public String getLowestGlucosValue() {
		return lowestGlucosValue;
	}
	public void setLowestGlucosValue(String lowestGlucosValue) {
		this.lowestGlucosValue = lowestGlucosValue;
	}
	public String getHighstGlucosValue() {
		return highstGlucosValue;
	}
	public void setHighstGlucosValue(String highstGlucosValue) {
		this.highstGlucosValue = highstGlucosValue;
	}
	public String getActivityType() {
		return activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}
	public String getInsulinType() {
		return insulinType;
	}
	public void setInsulinType(String insulinType) {
		this.insulinType = insulinType;
	}
	public String getMealTag() {
		return mealTag;
	}
	public void setMealTag(String mealTag) {
		this.mealTag = mealTag;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getHour() {
		return hour;
	}
	public void setHour(String hour) {
		this.hour = hour;
	}
	public String getMiunute() {
		return miunute;
	}
	public void setMiunute(String miunute) {
		this.miunute = miunute;
	}
	public String getMeredian() {
		return meredian;
	}
	public void setMeredian(String meredian) {
		this.meredian = meredian;
	}

}
