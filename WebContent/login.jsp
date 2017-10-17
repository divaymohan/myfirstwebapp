<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage = "errorPage.jsp" %>
<jsp:useBean id="loginn" class="testjavasql.checklogin" scope="session" />
 <jsp:setProperty name="loginn" property="*" /> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <%
            // 30 minute time out
          String uname = request.getParameter("userNameLogin");
          String pass = request.getParameter("passwordLogin");
          loginn.setUserName(uname);
          loginn.setPassword(pass);
          
        
          
          
          if(loginn.login()){
        	  session.setAttribute("Username", uname);
        	 %>
        	 <jsp:forward page="qus1.html"/>
        	 <% 
          }
          else{
        	  RequestDispatcher rs = request.getRequestDispatcher("index.html"); 
              rs.forward(request, response);
          }
        %>

    </body>
</html>