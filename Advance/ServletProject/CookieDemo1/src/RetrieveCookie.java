import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.*;

@WebServlet("/retrieveCookie")
public class RetrieveCookie extends HttpServlet
{

PrintWriter pw=null;

public void doGet(HttpServletRequest req, HttpServletResponse res)
throws ServletException, IOException
{
doPost(req,res);
}
public void doPost(HttpServletRequest req, HttpServletResponse
res) throws ServletException, IOException
{
pw=res.getWriter();
String username=null;
Cookie ck[] = req.getCookies();
if (ck!=null)
{
	for (int i=0; i<ck.length; i++)
	{
		if (ck[i].getName().equals("user"))
		{
			username = ck[i].getValue();
			break;
		}
}
	res.setContentType("text/html");
		pw.println(" Hello!<br>"+username);
}
else
{
pw.println("No cookies found");
}
}
}