import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/psd")
public class ParameterValuesDemo extends HttpServlet 
{

          /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
{
              PrintWriter out = response.getWriter();
              out.println("By Using Array");

              String[] selectedCourses=request.getParameterValues("courses");
              out.println("U Have Selected These Courses : ");
              for(int i=0;i<selectedCourses.length;i++)
              {
                      out.println(selectedCourses[i]);	
              }
}

}