<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="common/header.jsp"%>
<%@ include file="common/navigation.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First Web Application</title>
</head>
<body>

<div class="container">
	Welcome ${name}!! <a href="/list-todos">Click here</a> to manage your
	todo's.
</div>
<%@ include file="common/footer.jsp"%>
</body>
</html>