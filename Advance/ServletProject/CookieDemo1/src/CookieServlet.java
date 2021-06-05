import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/cookieServlet")
public class CookieServlet extends HttpServlet
{
     PrintWriter pw=null;
     public void doGet(HttpServletRequest req, HttpServletResponse res)
throws ServletException, IOException
{
      doPost(req,res);
}
public void doPost(HttpServletRequest req, HttpServletResponse
res) throws ServletException, IOException
{
     pw=res.getWriter();
     String username = req.getParameter("txtName");
     Cookie ck = new Cookie("user", username);
     res.addCookie(ck);
     res.setContentType("text/html");
     pw.println("Cookie containing user name is stored inyour browser.<br/>");
     pw.println("<a href='retrieveCookie'>Click Here for Next Request</a>");
}

}