import java.io.*;
import java.util.Enumeration;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/headerServlet")
public class HeaderServlet extends HttpServlet
{

 public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
 {
    res.setContentType("text/html");
    PrintWriter out=res.getWriter();

    Enumeration e=req.getHeaderNames();
     while(e.hasMoreElements())
     {
          String headerName=(String)e.nextElement();
          String headerValue=req.getHeader(headerName);
          out.println(headerName+"="+headerValue);
          out.println("<br/>");
    }
}
}


