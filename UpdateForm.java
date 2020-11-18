package com.montran.form;

import org.apache.struts.action.ActionForm;

public class UpdateForm extends ActionForm{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int dayDate;
	private int issueSerialNo;
	private String issueDate;
	private String returnDate;
	private String monthDate;
	private String yearDate;
	
	public int getDayDate() {
		return dayDate;
	}
	public void setDayDate(int dayDate) {
		this.dayDate = dayDate;
	}
	
	
	
	public int getIssueSerialNo() {
		return issueSerialNo;
	}
	public void setIssueSerialNo(int issueSerialNo) {
		this.issueSerialNo = issueSerialNo;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}	
	
	public String getMonthDate() {
		return monthDate;
	}
	public void setMonthDate(String monthDate) {
		this.monthDate = monthDate;
	}
	public String getYearDate() {
		return yearDate;
	}
	public void setYearDate(String yearDate) {
		this.yearDate = yearDate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
