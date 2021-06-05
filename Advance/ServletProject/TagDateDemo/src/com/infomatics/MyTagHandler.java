package com.infomatics;

import java.util.Calendar;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTagHandler extends TagSupport
{

	public int doStartTag() throws JspException 
	{
		JspWriter out=pageContext.getOut();  //returns the instance of JspWriter
		try
		{
                    out.println("It is generated by doStartTag()");
                   	out.print(Calendar.getInstance().getTime());    //printing date and time using JspWriter
		}
		catch(Exception e)
                                   {
	                    System.out.println(e);
		}
                                  return EVAL_BODY_INCLUDE;
//		return SKIP_BODY;
		//return SKIP_BODY;   //will not evaluate the body content of the tag  
	}
	public int doEndTag() throws JspException 
	{
		JspWriter out=pageContext.getOut();  //returns the instance of JspWriter
		try
		{
                       out.println("<br/>It is generated by doEndTag()");
                       out.print(Calendar.getInstance().getTime());
                 		}
		catch(Exception e)
                                   {
	                    System.out.println(e);
		}
                                  return EVAL_PAGE;
	
	}

}
