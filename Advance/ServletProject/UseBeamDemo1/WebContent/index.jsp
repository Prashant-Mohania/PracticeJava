<jsp:useBean id="obj" class="com.infomatics.Calculator" />
<jsp:useBean id="obj1" class="com.infomatics.User" />
<%
int m=obj.cube(5);
out.print("cube of 5 is "+m);

%>

<jsp:setProperty name="obj1" property="name" param="txtName" />

Welcome, <jsp:getProperty name="obj1" property="name" />