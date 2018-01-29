package com.study.servletConfig;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfigDemo1 extends HttpServlet {
	/*
	 * 定义servletConfig对象来接受配置的初始化参数
	 * */
	private ServletConfig config;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
			this.config=config;
	}
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
			//获取web.xml中配置的初始化参数
			//ServletConfig config=this.getServletConfig();
			
			String name = config.getInitParameter("name");
			response.getWriter().print(name);
			
		    response.getWriter().print("<hr/>");
		    //获取所有的初始化参数
		    Enumeration<String> names = config.getInitParameterNames();
		    
		    while(names.hasMoreElements()){
		    	String el = names.nextElement();
		    	String nameS = config.getInitParameter(el);
		    	 response.getWriter().print(name + "=" + nameS + "<br/>");
		    }
		   
		    
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			this.doGet(request, response);
	}

}
