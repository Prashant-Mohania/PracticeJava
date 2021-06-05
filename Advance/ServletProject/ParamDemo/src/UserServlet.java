import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/userServlet")
public class UserServlet extends HttpServlet
{
//	static final long serialVersionUID = 1;
	
      public void doGet(HttpServletRequest req,HttpServletResponse res)
      {
          PrintWriter out=null;
          String s1=req.getParameter("txtName");
          String s2=req.getParameter("txtPassword");

               try
               {
                       out=res.getWriter();
                       if(s1.equals("dd")&&(s2.equals("default")))
                       {
                         out.println("<h1>You Are a Valid User</h1>" );
                       }
                       else
                       {
                           out.println("<h1>You Are Not a Valid User</h1>" );
                       }
               }
               catch(Exception e)
               {
               }
                  out.close();
       }
}