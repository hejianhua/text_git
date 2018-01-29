package com.study.servletSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletSessionDemo1 extends HttpServlet {
	//session防止表单重复提交
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			request.setCharacterEncoding("utf-8");
			
			Boolean b = isRepeatSubmit(request);
			if(b){
				System.out.println("不能重复提交哦");
				return ;
			}
	
			String username = request.getParameter("username");
			String password = request.getParameter("password");

			System.out.println("表单提交了数据"+username+"-----"+password);
			
	}

	private Boolean isRepeatSubmit(HttpServletRequest request){
		//获取到session里面的值
		
		String check =(String)request.getSession().getAttribute("token");
		System.out.println(check);
		//获取表单里面的token
		
		String token = request.getParameter("token");
		System.out.println(token);
		//如果token不存在，说明表单已经提交了
		if(token==null){
			System.out.println("客户端token不存在");
			return true;
		}
		//如果当前用户不存在 token，用户是重复提交了
		if(check==null){
			System.out.println("服务器token不存在");
			return true;
		}
		//比较判断，token不同
		if(!check.equals(token)){
			System.out.println("token不一样");
			return true;
		}
		
		request.getSession().removeAttribute("token");
		return false;
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			this.doGet(request, response);
	
	}

}
