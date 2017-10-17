<%@page import="javax.swing.JTextArea"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:useBean id="inans3" class="testjavasql.InsertAns3" scope="session" />
 <jsp:setProperty name="loginn" property="*" /> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Question 3</title>
</head>
<body>
<%
String ans1 = request.getParameter("confirmationText");
inans3.setQus1(ans1);
inans3.display();
if(inans3.InsertData()){
%>
 <jsp:forward page="qus4.html"/>
 <%
}
else{
	%>
	<jsp:forward page="qus3.html"/>
	<%
}
 %>
</body>
</html>