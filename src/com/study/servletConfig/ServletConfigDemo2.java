package com.study.servletConfig;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfigDemo2 extends HttpServlet {

	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		 ClassLoader loader = ServletConfigDemo2.class.getClassLoader();
		 Enumeration<URL> resources = loader.getResources("db1.properties");
		 while(resources.hasMoreElements()){
			 	URL url = resources.nextElement();
			 	System.out.println(url);
		 }
		 System.out.println("------------------");
		 
		 ClassLoader loader2 = ServletConfigDemo2.class.getClassLoader();
		 Enumeration<URL> resources2 = loader2.getResources("/");
		 while(resources2.hasMoreElements()){
			 	URL url2 = resources2.nextElement();
			 	System.out.println(url2);
		 }

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			this.doGet(request, response);
	}

}
