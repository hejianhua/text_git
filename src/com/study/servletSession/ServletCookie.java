package com.study.servletSession;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletCookie extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {	
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//获取到cookie
		Cookie[] cookies = request.getCookies();
		System.out.println(cookies.length);
		if(cookies!=null){
			 for (Cookie cookie : cookies) {
				 if(cookie.getName().equals("lastTime")){
					 	String value = cookie.getValue();
					 	Date date = new Date(Long.valueOf(value));
					 	out.print(date);
				 }
				 System.out.println(cookie.getName());
			}
		}else{
			out.print("第一次来");
		}
		 Cookie cookie = new Cookie("lastTime", System.currentTimeMillis()+"");
		 cookie.setMaxAge(10);
		
		 response.addCookie(cookie);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

				this.doGet(request, response);
	}

}
