import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

import java.io.*;
import javax.servlet.http.*;

@WebServlet("/retrieveServlet")
public class RetriveServlet extends HttpServlet
{
ServletContext ctx;
String name;
String pgl;

 public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
  {
   ctx=getServletContext();
   name = (String)ctx.getAttribute("Name");
   pgl = (String)ctx.getAttribute("Pagal");
   PrintWriter pw = res.getWriter();
   res.setContentType("text/html");   //optional
   pw.println("<B>The Name is </B>: "+ name + "<br>");
   pw.println("<B>Pagal is <B>: " + pgl);
   }
}