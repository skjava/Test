<%-- 
    Document   : 1
    Created on : 17.02.2015, 21:45:06
    Author     : recber
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-type" content="text/html; charset=utf-8" />
    <%@ include file="WEB-INF/jspf/cssInclude.jspf"%>
    <link href="css/blueprint/plugins/print1.css" rel="stylesheet" type="text/css">
</head>

<body>

<%@ include file="WEB-INF/jspf/userId.jspf"%>

<ul>
<h1>EL Implicit Object Examples</h1>
<form action="formproc.jsp" method="post">
<table>
<tr>
 <td colspan="2"><h3>Design a Cake</h3></td>
</tr>
<tr>
<td>Cake shape:</td>
<td>
  <select name="shape">
     <option>round</option>
     <option>square</option>
     <option>heart</option>
   </select>
</td>
</tr>
<tr>
<td valign="top">Toppings</td>
<td>
  <input type="checkbox" name="topping" value="choc">Chocolate</input><br/>
  <input type="checkbox" name="topping" value="cane">Candy Cane</input><br/>
  <input type="checkbox" name="topping" value="flower">Flower</input><br/>
</td>

</tr>

<tr>
<td colspan="2">
  <center><input type="submit" value="Send"/></center>
</td>
</tr>
</table>
</ul>

<br/>

</body>
</html>
