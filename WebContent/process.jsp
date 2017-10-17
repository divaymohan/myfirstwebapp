<%@page import="org.apache.el.lang.ELSupport"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page language="java" %>
<%@ page import="java.util.*" %>
<%!%>
<jsp:useBean id="reg" scope="request" class="testjavasql.Testjavasql">
<jsp:setProperty name="reg" property="*"/>
</jsp:useBean>
 
<%if(reg.validate()){
reg.insertData();
%>
<jsp:forward page="success.jsp"/>
<% 
}
else{
%>	
<jsp:forward page="retry.jsp"/>
<% 	
}
%>

		


  
