<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<%!
			int globalCounter = 0;
		%>
		This page has been visited: <%= ++globalCounter %> Times.
		<%
			int localCounter = 0;
		%>
		This counter never increase its value: <%= ++localCounter %>
		<br>
		<h2>
			<%@ include file="a.jsp"%>
		</h2>
	</body>
</html>