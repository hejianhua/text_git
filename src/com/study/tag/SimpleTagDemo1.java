package com.study.tag;

import java.io.IOException;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SimpleTagDemo1 extends SimpleTagSupport{

	
	@Override
	public void doTag() throws JspException, IOException {
			//获取一个PageContext对象
		PageContext	context = (PageContext)this.getJspContext();
		
		//
		JspFragment jspBody = this.getJspBody();
		jspBody.invoke(null);
	}
}
