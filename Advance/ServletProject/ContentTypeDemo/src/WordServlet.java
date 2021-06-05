import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/wordServlet")
public class WordServlet extends HttpServlet
{

   public void doGet(HttpServletRequest request,HttpServletResponse response)throws   ServletException,IOException
  {
      response.setContentType("application/msword");
      PrintWriter out=response.getWriter();
      out.println("This document is created by a servlet");
      out.println("it is created to Demonstrate the usage of content type");
      out.close();
  }

}