package com.lemonade.version3.iOS.beans;

import com.qmetry.qaf.automation.data.BaseDataBean;

public class UserDetailBeans extends BaseDataBean{
	
	String emailID;
	String password;
    String firstName;
    String lastName;
    String username;
    String birthdayMonth;
    String birthdayDate;
    String birthdayYear;
    String belowAge;
    String clinicCode;
    String officName;
    String officeNumber;
    
    
    
   	public String getOfficeNumber() {
		return officeNumber;
	}
	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}
	public String getClinicCode() {
		return clinicCode;
	}
	public void setClinicCode(String clinicCode) {
		this.clinicCode = clinicCode;
	}
	public String getOfficName() {
		return officName;
	}
	public void setOfficName(String officName) {
		this.officName = officName;
	}
	public String getBelowAge() {
   		return belowAge;
   	}
   	public void setBelowAge(String belowAge) {
   		this.belowAge = belowAge;
   	}
    
    
	public String getBirthdayMonth() {
		return birthdayMonth;
	}
	public void setBirthdayMonth(String birthdayMonth) {
		this.birthdayMonth = birthdayMonth;
	}
	public String getBirthdayDate() {
		return birthdayDate;
	}
	public void setBirthdayDate(String birthdayDate) {
		this.birthdayDate = birthdayDate;
	}
	public String getBirthdayYear() {
		return birthdayYear;
	}
	public void setBirthdayYear(String birthdayYear) {
		this.birthdayYear = birthdayYear;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	

}
