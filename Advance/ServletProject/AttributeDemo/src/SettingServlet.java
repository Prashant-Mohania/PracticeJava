import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

import java.io.*;
import javax.servlet.http.*;

@WebServlet("/settingServlet")
public class SettingServlet extends HttpServlet
{
   ServletContext ctx;

public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
          ctx=getServletContext();
          ctx.setAttribute("Name","Prashant Mohania");
          ctx.setAttribute("Pagal","IamPramo");
          PrintWriter pw = response.getWriter();
pw.println("<B>Name has been set as a contextattribute</B>");
pw.println("<a href='retrieveServlet'>Click Here For RetrieveServlet</a>");
}
}