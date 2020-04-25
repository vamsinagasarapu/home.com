<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation page</title>
</head>
<body>

<h1> hello ${personName}  your order ${OrderedItemName} is received</h1>

<%
String name=request.getParameter("foodType");
out.print("you have ordered :"+name);

%>

</body>
</html>