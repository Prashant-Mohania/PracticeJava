package com.infomatics;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CopyrightTagHandler extends TagSupport
{

	public int doStartTag() throws JspException
	{

	try
	{
   JspWriter out=pageContext.getOut();
   out.println("<BR/><B> &copy; dd 1994-2020 All Right Reserve.<B>");
	}
	catch(Exception e)
	{
	System.err.println("IO Exception");
	}
		return SKIP_BODY;
	}
        public int doEndTag() throws JspException
	    {
            return SKIP_PAGE;
        }
}

