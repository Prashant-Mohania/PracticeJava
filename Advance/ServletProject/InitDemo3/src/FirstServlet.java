import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.*;

@WebServlet("/firstServlet")
public class FirstServlet extends HttpServlet
{

    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {

        PrintWriter out=response.getWriter();
        String s1=request.getParameter("txtNum1");
        String s2=request.getParameter("txtNum2");

ServletContext cntx=getServletContext();
RequestDispatcher disp=cntx.getRequestDispatcher("/secondServlet");
        try
        {
            int x1=Integer.parseInt(s1);
            int x2=Integer.parseInt(s2);
            int div=x1/x2;
            out.println("Result is "+div);
        }
        catch(Exception ex)
        {
            request.setAttribute("EXCInfo", ex);
            disp.forward(request, response);
			//disp.include(request, response);
        }
        response.setContentType("text/html");
	out.println("<br/>We are in First Servlet");
  }
}
