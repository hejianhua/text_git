package com.study.servletPrint;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletPrintDemo1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
			response.getOutputStream().write("哈哈，write是字节流哦呢？".getBytes("utf-8"));
			byte[] bytes = "100".getBytes("utf-8");
			System.out.println(bytes[0]);
			System.out.println(bytes[1]);
			System.out.println(bytes[2]);
			response.getOutputStream().write(49);
			// 在utf-8 里面用数值来代表
			//解释一下为什么1不行，输入49 为什么又变成1了
			// 我49，要变成0101才能传， 我变成二进制以后，按照utf-8的形式传过去。 然后UTF-8解析，发现是49 ，对应码表一查，对应的是 ’1‘ 所以就是’1‘了
			//
	
	
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

				this.doGet(request, response);
	}

}
