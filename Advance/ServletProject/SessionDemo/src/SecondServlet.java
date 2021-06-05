import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/secondServlet")
public class SecondServlet extends HttpServlet
{
public void doGet(HttpServletRequest request, HttpServletResponse response)
{
		try
		{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//This below line is using existing session only
    	HttpSession session=request.getSession(false);
		if(session==null)
		{
			     response.sendRedirect("Login.html");
		}
        String n=(String)session.getAttribute("uname");
        out.print("Hello   "+n);
        out.close();
         }
		catch(Exception e)
		{
				System.out.println(e);
			}
	}
}