<%-- 
    Document   : index
    Created on : 10-Apr-2024, 3:59:35 am
    Author     : Utkarsh Kumar
--%>

<%@page import="com.mycompany.getpharma.helper.FactoryProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>GETPHARMA-Home Page</title>
      <%@include file="componenets/common_css_js.jsp"%>
        <%@include file="componenets/navbar.jsp" %>

    </head>
    <body>
       
        <h1>Hello World!</h1>
        <h1>creating session factory object</h1>
        <%
      out.println(FactoryProvider.getFactory());   
     

           %> 
    </body>
</html>
