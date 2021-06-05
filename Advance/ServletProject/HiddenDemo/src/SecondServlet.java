import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/secondServlet")
public class SecondServlet extends HttpServlet
{
public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
{
String uname = req.getParameter("huser");
PrintWriter pw = res.getWriter();
pw.println("Hello! "+uname);
}
}