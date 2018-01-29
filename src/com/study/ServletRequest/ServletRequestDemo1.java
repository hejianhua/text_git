package com.study.ServletRequest;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletRequestDemo1 extends HttpServlet {

	//用来练习接受request的内容
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setCharacterEncoding("utf-8");//设置字符，以UTF-8 编码输出到客户端浏览器
		//通过设置响应头控制浏览器以UTF-8的编码显示数据
		response.setHeader("content-type", "text/html;charset=UTF-8");
		//获取所有请求头的集合
		Enumeration<String> enuNames = request.getHeaderNames();
		//遍历得到请求头的名字 和值
	// PrintWriter out = response.getWriter();
	 OutputStream out2 = response.getOutputStream();
		while(enuNames.hasMoreElements()){
			String key = enuNames.nextElement();
			String header = request.getHeader(key);
			System.out.println(key);
			System.out.println(header);
			System.out.println("-------------------");
		//	out.write(key+"======"+header);
			out2.write("<br/>".getBytes());
		out2.write((key+"======"+header).getBytes());
		}
		
		
		//特别注意： getWriter()与 getOutputStream() 是互相冲突的
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

				this.doGet(request, response);
	}

}
