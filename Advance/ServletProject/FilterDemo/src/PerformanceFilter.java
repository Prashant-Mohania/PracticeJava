import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName="PerformanceFilter",urlPatterns="/helloServlet")
public class PerformanceFilter implements Filter
{
	public void init(FilterConfig fc) throws ServletException
	{
	}
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException
		{

		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		out.print("filter is invoked before");
	    chain.doFilter(req, resp);//sends request to next resource
        out.print("filter is invoked after");
}
	public void destroy()
	{
	}
}
