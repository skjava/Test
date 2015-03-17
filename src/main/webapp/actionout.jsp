<%-- 
    Document   : actionout
    Created on : 23.02.2015, 18:01:14
    Author     : recber
<%@page import="java.util.Map.Entry"%>
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <%@ include file="WEB-INF/jspf/cssInclude.jspf"%>        
        <title>JSP Page</title>
    </head>
    <body>
 <h2>Action Table</h2>
 <c:forEach var="map_entry" items="${param}">
    <strong><c:out value="${map_entry.key}" /></strong>: 
    <c:out value="${map_entry.value}" /><br><br>
</c:forEach>
    </body>
</html>
