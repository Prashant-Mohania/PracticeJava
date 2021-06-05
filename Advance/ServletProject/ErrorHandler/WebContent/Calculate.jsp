<!DOCTYPE html>
<html>
<body>
  <%@ page errorPage="ErrorHandler.jsp" %>

<%
        String str=request.getParameter("r1");
        String str1=request.getParameter("t1");
        String str2 = request.getParameter("t2");

        String final_output="";

                    int num1=0;
                    int num2=0;
                    int res=0;

                      num1 = Integer.parseInt(str1);
                      num2 = Integer.parseInt(str2);
                    if(str.equals("add"))
                    {
                        res=num1+num2;
                        final_output="Addition";
                 	 }
         	   if(str.equals("div"))
                    {
				res=num1/num2;
				final_output="Division";
	             }
   %>

<h1>The selected mathematical function by you is:</h1> 
<%= final_output %>
<br/>
 <%="The Result is "+ res %>
</body>
</html>