package com.montran.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class GetDetailsForm extends ActionForm{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int memberCode;
	 private String memberName;
	 private int bookCode;
	 private String bookAuthor;
	 private String bookTitle;
	 private int issueSerialNo;
	 private String issueDate;
	 private String returnDate;
      
	 


	 
	public int getMemberCode() {
		return memberCode;
	}
	public void setMemberCode(int memberCode) {
		this.memberCode = memberCode;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getBookCode() {
		return bookCode;
	}
	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
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
	@Override
	public String toString() {
		return "GetDetailsForm [memberCode=" + memberCode + ", memberName=" + memberName + ", bookCode=" + bookCode
				+ ", bookAuthor=" + bookAuthor + ", bookTitle=" + bookTitle + ", issueSerialNo=" + issueSerialNo
				+ ", issueDate=" + issueDate + ", returnDate=" + returnDate + "]";
	}

	@Override
	 public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
			ActionErrors errors = new ActionErrors();                                        //Validation
			System.out.println("In validate ()");
			
			if(request.getParameter("member")!=null) {
				System.out.println("In member code validation");
				if(memberCode!= 0)
					System.out.println("member value is not zero");
				else {
					System.out.println("member value is zero");
					errors.add("common.name.err", new ActionMessage("error.common.membercode.required"));
					System.out.println("Going to print errors");
				}
			}	
			if(request.getParameter("book")!=null) {
					System.out.println("In book code validation");
					if(bookCode==0) {
						System.out.println("book ID value is zero");
					    errors.add("common.name.err", new ActionMessage("error.common.bookcode.required"));
					    System.out.println("Going to print errors object");
					}    
			}
			
			System.out.println(errors);
			return errors;
		}
}
