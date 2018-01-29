package com.study.servletConfig;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServelrProperties extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		//使用类装载器读取src目录下的 db1.properties
		 ClassLoader loader = ServelrProperties.class.getClassLoader();
		 Enumeration<URL> resources = loader.getResources(".");
		 while(resources.hasMoreElements()){
			 	URL url = resources.nextElement();
			 	System.out.println(url);
		 }
		InputStream in = loader.getResourceAsStream("db1.properties");
		//看一下这个
		 String realPath = this.getServletContext().getRealPath("/");
		 System.out.println(realPath);
		 String realPath2 = this.getServletContext().getRealPath("");
		 System.out.println("看看. 到底是啥"+realPath2);
		 System.out.println("-----------------------");
		 //看一下servletContext的
		 String path = this.getServletContext().getContextPath();
		 System.out.println(path);
		 InputStream stream = this.getServletContext().getResourceAsStream("/");

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			this.doGet(request, response);

	}
	
	
	

}
