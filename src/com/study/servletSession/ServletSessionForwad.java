package com.study.servletSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletSessionForwad extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			request.setCharacterEncoding("utf-8");
			String token = RandomToken.getRandomToken().getRandom();
			HttpSession session = request.getSession();
			//把token给到session
			session.setAttribute("token", token);
			Random r = new Random();
			int nextInt = r.nextInt(10);
			System.out.println(nextInt);
			
			request.getRequestDispatcher("/WEB-INF/sessionDemo1.jsp").forward(request, response);//跳转到jsp页面
			
	
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

				this.doGet(request, response);
	}

}
