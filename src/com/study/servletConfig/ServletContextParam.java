package com.study.servletConfig;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextParam extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
			//获取web.xml里面的初始化参数。
		//response.setStatus(302);
		//response.setHeader("refresh", "3;url='http://www.baidu.com'");
			String url = this.getServletContext().getInitParameter("url");
			//设置一下刷新，跳转到百度
			response.setHeader("refresh", "5;url=http://"+url);
			response.getWriter().print("我是全局的哦哦哦哦哦哦哦哦哦哦哦哦哦");
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			this.doGet(request, response);
	
	}

}
