package com.montran.action;

import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.montran.dao.LibraryDAO;
import com.montran.form.UpdateForm;
import com.montran.pojo.Book;
import com.montran.pojo.BookBorrow;

public class UpdateAction extends Action {
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)
			        throws Exception {
		
		LibraryDAO dao=new LibraryDAO(); 
   	    BookBorrow borrowDetails=null;
		UpdateForm updateForm = (UpdateForm) form;
		Book book=null;
		 Date date=new Date();
		
		
// 	        if(request.getParameter("book")!=null)
// 	        {
// 	        	if(request.getParameter("book").equals("getBook")) {
// 	        		System.out.println("Get book button clicked");
// 	           	    System.out.println(updateForm.getBookCode());
// 	           	    book=dao.getBookName(updateForm.getBookCode());
// 	           	    System.out.println(book);
// 	            	updateForm.setIssueDate(book.getIssueDate().toString());
// 	            	updateForm.setIssueDate(borrowDetails.getReturnDate().toString());
// 	        	}
// 	        }
		    
		if(request.getParameter("issueSerial")!=null)
 	        {
 	        	if(request.getParameter("issueSerial").equals("getIssueDetails")) {
 	        		System.out.println("Get Issue details button clicked");
 	           	    System.out.println(updateForm.getIssueSerialNo());
 	             	borrowDetails=dao.getIssueDetails(updateForm.getIssueSerialNo());
 	           	    System.out.println(borrowDetails);
 	            	updateForm.setIssueDate(borrowDetails.getIssueDate().toString());
 	            	updateForm.setReturnDate(borrowDetails.getReturnDate().toString());
 	            	return mapping.findForward("success");
 	        	}
 	        }
		if(request.getParameter("UpdateButton")!=null)
	        {
	        	if(request.getParameter("UpdateButton").equals("Update")) {
	        		System.out.println(" Update button clicked");
	           	    String day=request.getParameter("dayDate");                         //day
	           	    String month=request.getParameter("monthDate");                      //month
	           	    
	           	    Calendar calendar = Calendar.getInstance();
	           	    calendar.setTime(date);
	           	    String year=String.valueOf(calendar.get(Calendar.YEAR));             //year
	           	    
	           	    String newIssueDate=year+"-"+month+"-"+day;
	           	    System.out.println(newIssueDate);
	           	    
	            	return mapping.findForward("success");
	        	}
	        }
		
	        return mapping.findForward("success");
	}
}