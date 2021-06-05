import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/hiddenServlet")
public class HiddenServlet extends HttpServlet
{
public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
{
           PrintWriter pw = res.getWriter();
           pw.println("Hello! click Submit to proceed");
           String username = req.getParameter("txtName");
res.setContentType("text/html");
pw.println("<Form action=secondServlet method=post>");
pw.println("<input type=hidden name=huser value="+username+">");

pw.println("<input type=\"Submit\" value=\"Submit\"></form>");
}
}