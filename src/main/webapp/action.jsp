<%-- 
    Document   : action
    Created on : 23.02.2015, 17:09:51
    Author     : recber
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" %>
<jsp:useBean id="cart" class="ua.recber.bean.ActionBean" scope="session" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@ include file="WEB-INF/jspf/cssInclude.jspf"%>
        <title>ActionJSP</title>
    </head>

    <body>
 <div class="container">
     
        <h1>Action Form</h1>
        <table>
            <tr>
  <form action="action.ua" method="post">
 <td>Action1</td>
 <td><input type="text" name="action1" size="40" maxlength="256"></td>
 <td><input type="submit" value="v"></td>
 <td> <input type="reset" value="x" /></td>
 </form>
             </tr>
              <tr>
  <form action="action2.ua" method="post">
 <td>Action2</td>
 <td><input type="text" name="action2" size="40" maxlength="256"></td>
 <td><input type="submit" value="v"></td>
 <td> <input type="reset" value="x" /></td>
 </form> 
               </tr>
        </table>     
     
<%--      
        <h1>Action Form</h1>
        <table>
            <tr>
                <td>Action1</td>		
                <td>
                    <form action="action.jsp" method="post">
                        <input type="text" name="Action1" size="40" maxlength="256">
                        </td>
                        <td>                         
                            <input type="submit" value="Add">
                        </td>
                    </form>
            </tr>

            <tr>
                <td>Action2</td>		
                <td>
                    <form action="action.jsp" method="post">
                        <input type="text" name="Action2" size="40" maxlength="256">
                        </td>
                        <td>                         
                            <input type="submit" value="Add">
                        </td>
                    </form>
            </tr>

            <tr>
                <td>Action3</td>		
                <td>
                    <form action="action.jsp" method="post">
                        <input type="text" name="Action3" size="40" maxlength="256">
                        </td>
                        <td>
                            <input type="submit" value="Add">                        
                        </td>
                    </form>
            </tr>
        </table>
    
  <h2>Action Table</h2>
  <form> 
  </form>
  <table>
 <c:forEach var="map_entry" items="${param}">
     	<tr>
		<td><strong><c:out value="${map_entry.key}" /></strong>:</td>
		<td> <c:out value="${map_entry.value}" /></td>
	</tr>
   
</c:forEach>
    </table>
--%>
  <h2>Action Table</h2>
  <form> 
  </form>
  <table>
      <tr>
 <form action="action.jsp" method="post">         
 <c:forEach items="${cart.a1}" var="action1">    	
         <td><b>Action1</b></td>       
     <td>${action1}</td>
<%--      <td> <input type="reset" value="x" /></td>--%>
         	   
</c:forEach>
 </form>
      </tr>
      <tr>
 <form action="action.jsp" method="post">             
<c:forEach items="${cart.a2}" var="action2">
    <td><b>Action2</b></td>
     <td>${action2}</td>
<%--      <td> <input type="reset" value="x" /></td>--%>
</c:forEach>
 </form>   
     </tr>
    </table>
          <a href="index.html">Back>>></a>
</div>
</body>
</html>
