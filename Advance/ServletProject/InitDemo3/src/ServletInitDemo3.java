import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import javax.servlet.annotation.*;

@WebServlet(urlPatterns="/initdemo",initParams={@WebInitParam(name="myname",value="dd"),@WebInitParam(name="age",value="37")})
public class ServletInitDemo3 extends HttpServlet
{
String strName;
String strValue;
Enumeration en;
ServletConfig cfg;

public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
{

cfg=getServletConfig();
en=cfg.getInitParameterNames();

while(en.hasMoreElements())
{
strName=(String)en.nextElement();
strValue=cfg.getInitParameter(strName);

res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println(strName+"="+strValue);
out.println("<br/>");
}

}
}