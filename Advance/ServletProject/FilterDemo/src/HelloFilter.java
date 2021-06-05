import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/helloServlet")
public class HelloFilter extends HttpServlet
{

public void doGet(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException 
{
	PrintWriter out = response.getWriter();
	response.setContentType("text/html");
	out.print("<br/><h1>welcome to servlet</h1><br/>");
}

}


