<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Details</title>
</head>
<body>
  <h3>Update Book Issue Details</h3>
  <hr>
 <html:form action="/updateAction" method="post">
  <table>
     <tr>
         <td>Enter Issue Serial Number </td>
         <td><html:text property="issueSerialNo"></html:text></td>
         <td><html:submit property="issueSerial" value="getIssueDetails" >Get Issue Details</html:submit></td>
     </tr>
     <tr>
          <td>Your Current Book Issue date is: </td>
          <td><html:text property="issueDate" disabled="true" ></html:text></td>
     </tr>
     <tr>     
          <td>Your Current Book Return date is: </td>
          <td><html:text property="returnDate" disabled="true" ></html:text></td>
     </tr>
      <tr>  
           <td>Enter New Date of Issue</td>
  
<%--    <td><html:select property="dayDate">  --%>
<%--           <%  
//                int day=0; 
//                for (int i=0;i<32;i++)  {
//                  day=i++; 
//                  out.println("<html:option value="+ day +"></html:option>"); 
//                }  
<%--               %>  --%>
<%--          </html:select></td> --%>
         <td> <html:select property="dayDate">  
              <html:option value="1"></html:option>
              <html:option value="2"></html:option>
              <html:option value="3"></html:option>
              <html:option value="4"></html:option>
              <html:option value="5"></html:option>
              <html:option value="6"></html:option>
              <html:option value="7"></html:option>
              <html:option value="8"></html:option>
              <html:option value="9"></html:option>
              <html:option value="10"></html:option>
              <html:option value="11"></html:option>
              <html:option value="12"></html:option>
              <html:option value="13"></html:option>
              <html:option value="14"></html:option>
              <html:option value="15"></html:option>
              <html:option value="16"></html:option>
              <html:option value="17"></html:option>
              <html:option value="18"></html:option>
              <html:option value="19"></html:option>
              <html:option value="20"></html:option>
              <html:option value="21"></html:option>
              <html:option value="22"></html:option>
              <html:option value="23"></html:option>
              <html:option value="24"></html:option>
              <html:option value="25"></html:option>
              <html:option value="26"></html:option>
              <html:option value="27"></html:option>
              <html:option value="28"></html:option>
              <html:option value="29"></html:option>
              <html:option value="30"></html:option>
              <html:option value="31"></html:option>           
            </html:select>  </td>
      
           <td>Month</td>     
            <td> <html:select property="monthDate"> 
                 <option selected>01</option>
                 <option>02</option>
                 <option>03</option>
                 <option>04</option>
                 <option>05</option>
                 <option>06</option>
                 <option>07</option>
                 <option>08t</option>
                 <option>09</option>
                 <option>10</option>
                 <option>11</option>
                 <option>12</option>         
            </html:select>  </td> 
            <td>
         <td>Year</td> 
         <td><html:text property="yearDate" disabled="true"></html:text></td>
      
       </tr>
    </table>  
    <html:submit property="UpdateButton" value="Update" >Update</html:submit>   
 </html:form>
</body>
</html>