package com.study.ServletRequest;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.MessageFormat;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletRequestDemo2 extends HttpServlet {
	
	//得到请求的参数
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		  	
		
	  	request.setCharacterEncoding("UTF-8");
	  	response.setContentType("text/html;charset=utf-8");
	  	response.setCharacterEncoding("UTF-8");
	  	
		String username = new String(request.getParameter("username").getBytes("ISO-8859-1"),"UTF-8");
		String password = new String(request.getParameter("password").getBytes("ISO-8859-1"),"UTF-8");
		System.out.println(password);
		String dept = request.getParameter("dept");
		String random= request.getParameter("random");
		String sex = request.getParameter("sex");
		String[] inset = request.getParameterValues("inst");
		String hidden = request.getParameter("hiddenValue");
		
		//处理一下数组
		System.out.println(inset.length);
		String in="";
			for(int i=0;inset!=null&&i<inset.length;i++){
				if(i!=inset.length-1){
						
					in+=new String(inset[i].getBytes("ISO-8859-1"),"UTF-8")+",";
				}else{
					in+=inset[i];
				}
			}
		
			
		//输出到外面
		PrintWriter out = response.getWriter();
		//OutputStream out = response.getOutputStream();
		//定义一个表格
		String table="<table>"
				+"<tr><td>用户:</td><td>{0}</td></tr>"
				+"<tr><td>密码：</td><td>{1}</td></tr>"
				+"<tr><td>部门</td><td>{2}</td></tr>"
				+"<tr><td>自定义</td><td>{3}</td></tr>"
				+"<tr><td>性别</td><td>{4}</td></tr>"
				+"<tr><td>兴趣</td><td>{5}</td></tr>"
				+"<tr><td>隐藏文</td><td>{6}</td></tr>"
				+ "</table>";
		//插入数据
		String format = MessageFormat.format(table,username, password,dept,random,sex,in,hidden);
		System.out.println(format);
	//	response.setContentType("text/html;charset=UTF-8");//设置客户端浏览器以UTF-8编码解析数据
		//	out.write(format.getBytes("utf-8"));
		out.write(format);
		out.print(format);
		
		
		
		
		
		
		
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
	  	response.setContentType("text/html;charset=utf-8");
	  	response.setCharacterEncoding("UTF-8");
	  	
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String dept = request.getParameter("dept");
		String random= request.getParameter("random");
		String sex = request.getParameter("sex");
		String[] inset = request.getParameterValues("inst");
		String hidden = request.getParameter("hiddenValue");
		
		//处理一下数组
		System.out.println(inset.length);
		String in="";
			for(int i=0;inset!=null&&i<inset.length;i++){
				if(i!=inset.length-1){
					in+=inset[i]+",";
				}else{
					in+=inset[i];
				}
			}
		
		//输出到外面
		PrintWriter out = response.getWriter();
		//OutputStream out = response.getOutputStream();
		//定义一个表格
		String table="<table>"
				+"<tr><td>用户:</td><td>{0}</td></tr>"
				+"<tr><td>密码：</td><td>{1}</td></tr>"
				+"<tr><td>部门</td><td>{2}</td></tr>"
				+"<tr><td>自定义</td><td>{3}</td></tr>"
				+"<tr><td>性别</td><td>{4}</td></tr>"
				+"<tr><td>兴趣</td><td>{5}</td></tr>"
				+"<tr><td>隐藏文</td><td>{6}</td></tr>"
				+ "</table>";
		//插入数据
		String format = MessageFormat.format(table,username, password,dept,random,sex,in,hidden);
		System.out.println(format);
	//	response.setContentType("text/html;charset=UTF-8");//设置客户端浏览器以UTF-8编码解析数据
		//	out.write(format.getBytes("utf-8"));
		out.write(format);
		out.print(format);
	}

}
