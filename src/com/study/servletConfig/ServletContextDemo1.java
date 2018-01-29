package com.study.servletConfig;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextDemo1 extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			 //看一下File
			 File file=new File("1.txt");
			 System.out.println(file.getAbsolutePath());
			
			 File file2=new File("/");
			 System.out.println(file2.getAbsolutePath());
			
			Ordinary or = new Ordinary();
		/*	try {
				or.getFilePath();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			or.getLoardPath();
			or.readDB4();
			or.readDB2();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			this.doGet(request, response);
	}

}
