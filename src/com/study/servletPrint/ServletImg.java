package com.study.servletPrint;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletImg extends HttpServlet {
	
	//做一个生成随机图片验证码例子
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		response.setHeader("refresh", "5");
		//在内存中创建一张图片
		BufferedImage img = new BufferedImage(120, 30, BufferedImage.TYPE_INT_RGB);
		Graphics2D  g =(Graphics2D)img.getGraphics();
		g.setColor(Color.GREEN);
		g.fillRect(0, 0, 80, 20);
		//图片上 写数据
		g.setColor(Color.BLACK);
		g.setFont(new Font(null,Font.BOLD,20));
		g.drawString(randomNum(), 0, 20);
		//设置响应头，浏览器以图片的方式打开
		response.setContentType("image/jpeg");
		//设置响应头，控制浏览器不缓存图片数据
		response.setDateHeader("expries", -1);
		response.setHeader("Cache-Control", "no-cache");
		response.setHeader("Pragma", "no-cache");
		//图片写给浏览器
		ImageIO.write(img, "jpg", response.getOutputStream());
	
	}

	//写一个生成随机数的方法
	private String  randomNum(){
		Random r =new Random();
		String num = r.nextInt(999999)+"";
		StringBuffer bf=new StringBuffer();
		for(int i=0;i<7-num.length();i++){
			bf.append("0");
		}
		num=num+bf.toString();
		
		return num;
	}
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			this.doGet(request, response);
	}

}
