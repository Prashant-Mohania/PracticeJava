import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/demoServlet")
public class DemoServlet extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res)
throws ServletException,IOException
{
  String url=req.getParameter("txtName");
  PrintWriter pw=res.getWriter();
res.sendRedirect("http://"+url);
pw.close();
}
}



