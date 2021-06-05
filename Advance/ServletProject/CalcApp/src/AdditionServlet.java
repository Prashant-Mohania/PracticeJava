import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
@WebServlet("/additionServlet")
public class AdditionServlet extends HttpServlet
{

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public void doGet(HttpServletRequest req,HttpServletResponse res)
		{
		      PrintWriter out=null;
			   int v1=Integer.parseInt(req.getParameter("txtNum1"));
               String s=req.getParameter("txtNum2");
	           int v2=Integer.parseInt(s);

               try
               {
                       out=res.getWriter();
                        int result=v1+v2;
                        out.println("<h1>The Result is </h1>"+result);

               }
                catch(Exception e)
                {
                }
                    out.close();
      }
}