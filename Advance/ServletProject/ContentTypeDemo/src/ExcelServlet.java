import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/excelServlet")
public class ExcelServlet extends HttpServlet
{

   public void doGet(HttpServletRequest request,HttpServletResponse response)throws  ServletException,IOException
  {

             //response.setContentType("application/vnd.ms-excel");
             response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
				
                 PrintWriter out=response.getWriter();
                 out.println("Name\tJob\tSalary");
                 out.println("Ajay\t Manager\t 5000");
                 out.println("DD\t Trainer\t 7000");
               	out.println("\t Total Salary\t=sum(c2:c3)");

                out.close();
     }
}