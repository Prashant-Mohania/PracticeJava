import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/firstServlet")
public class FirstServlet extends HttpServlet
{
public void doGet(HttpServletRequest request, HttpServletResponse response)
{
		try
		{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String n=request.getParameter("txtName");
	         out.print("Welcome   "+n);
                 HttpSession session=request.getSession();
                 session.setAttribute("uname",n);
                 out.print("<a href='secondServlet'>Click Here For Next Request</a>");
        	out.close();
                 }
         	  catch(Exception e)
	          {
             	  System.out.println(e);
	          }
}
}