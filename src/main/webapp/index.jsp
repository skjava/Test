<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta http-equiv="Content-type" content="text/html; charset=utf-8" />
    <%@ include file="WEB-INF/jspf/cssInclude.jspf"%>
    <link href="css/blueprint/plugins/print1.css" rel="stylesheet" type="text/css">
</head>

<body>

<%@ include file="WEB-INF/jspf/userId.jspf"%>

<ul>
<s:checkbox label="checkbox test" name="checkboxField1" value="aBoolean" fieldValue="true"/>
</ul>

<br/>

</body>
</html>
