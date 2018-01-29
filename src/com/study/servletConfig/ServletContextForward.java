package com.study.servletConfig;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextForward extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().print("欢迎来到英雄联盟，你即将转发");
		
		
		try {
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.getServletContext().getRequestDispatcher("/ServletContextParam").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				this.doGet(request, response);
	}

}
