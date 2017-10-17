<%@page import="javax.swing.JTextArea"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:useBean id="inans1" class="testjavasql.InsertAns1" scope="session" />
 <jsp:setProperty name="loginn" property="*" /> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Question 1</title>
</head>
<body>
<%
String ans1 = request.getParameter("confirmationText");
inans1.setQus1(ans1);
inans1.display();
if(inans1.InsertData()){
%>
 <jsp:forward page="qus2.html"/>
 <%
}
else{
	%>
	<jsp:forward page="qus1.html"/>
	<%
}
 %>
</body>
</html>