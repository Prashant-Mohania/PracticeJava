import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/secondServlet")
public class SecondServlet extends HttpServlet
{
public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
{

String uname = req.getParameter("uname");
PrintWriter pw = res.getWriter();
pw.println("Hello! "+uname);

}
}