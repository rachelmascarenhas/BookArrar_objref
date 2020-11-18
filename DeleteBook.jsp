<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book deletion</title>
</head>
<body>
<html:form action="deleteBookAction">
<html:text property="issueSerialNo"></html:text>
<html:submit property="submit" value="submit">Submit</html:submit>
</html:form>
</body>
</html>