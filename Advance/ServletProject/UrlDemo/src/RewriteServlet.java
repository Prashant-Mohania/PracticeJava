import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/rewriteServlet")
public class RewriteServlet extends HttpServlet
{

public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
{
    String username = req.getParameter("txtName");
    PrintWriter pw = res.getWriter();
    res.setContentType("text/html");

pw.println("Hello! <a href=secondServlet?uname="+ username + "> click here </a>to proceed");
}
}