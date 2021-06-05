import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.*;

@WebServlet("/secondServlet")
public class SecondServlet extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        PrintWriter pw=response.getWriter();
        Exception exc=(Exception)request.getAttribute("EXCInfo");
        String msg=exc.getMessage();
        response.setContentType("text/html");
        pw.println("<marquee><H1>OOPs Error Occured!!!!</H1></marquee>");
        pw.println("Class is "+exc.getClass()+"<BR/>");
        pw.println("<B>Exception type:"+msg+"<BR/></B>");
pw.println("<a href='index.html'>try again!!!!!</a>");
   }
}



