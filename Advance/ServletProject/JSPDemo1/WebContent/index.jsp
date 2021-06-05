<!DOCTYPE html>
<html>
	<head>
		<title>JSP Demo</title>
	</head>
	<body>
		<h1>Hello World</h1>
		<%
			for(int i = 1; i<=5;i++){
				out.println("<br/>OCAJP " + i);
			}
		%>
	</body>
</html>