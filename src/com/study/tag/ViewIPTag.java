package com.study.tag;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class ViewIPTag implements Tag{

	// 利用组合，接受传递来的pageContext对象
	private PageContext pageContext;
	@Override
	public int doEndTag() throws JspException {
		System.out.println("调用doEndTag");
		return 0;
	}

	@Override
	public int doStartTag() throws JspException {
		System.out.println("调用doStartTag");
		HttpServletRequest request = (HttpServletRequest) pageContext.getRequest();
		JspWriter out = pageContext.getOut();
		String ip=request.getRemoteAddr();
		try {
			out.write(ip);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
		return 0;
	}

	@Override
	public Tag getParent() {
		System.out.println("调用getParent");
		return null;
	}

	@Override
	public void release() {
		System.out.println("调用release");
		
	}

	@Override
	public void setPageContext(PageContext pageContext) {
		 System.out.println("接受pageContext");
		 this.pageContext=pageContext;
	}

	@Override
	public void setParent(Tag arg0) {
		System.out.println("调用Tag");
		
	}
	
}
