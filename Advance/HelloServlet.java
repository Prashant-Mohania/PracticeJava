import javax.*;

//This demo is for life cycle
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/dd")
public class HelloServlet implements Servlet
{
     ServletConfig config;
    public void init(ServletConfig sc)
    {
                 config=sc;
            	System.out.println("in Init");
    }
   public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
   {
            System.out.println("in service");
    }
       public void destroy()
        {
                System.out.println("in destroy");
        }
	public String getServletInfo() 
    {
		  return "LifeCycleServlet";
	}
    public ServletConfig getServletConfig()
    {
		return config;
   }
}

