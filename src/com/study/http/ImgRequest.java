package com.study.http;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ImgRequest extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//设置content-type 响应头，指定回送数据类型
		//使用content-type响应头指定发送给浏览器的数据类型为"image/jpeg"
	//	response.setHeader("content-type", "img/jpeg");
		String url = this.getServletContext().getInitParameter("url");
		//设置响应头，让浏览器定时刷新，然后跳转到baidu
		response.setHeader("refresh", "1;url=http://"+url);
		//读取位于项目根目录下的img文件夹里面的图片，返回一个输出流
		InputStream in = this.getServletContext().getResourceAsStream("/img/aaa.jpg");
		byte []  buffer = new byte[1024];
		int len=0;
		OutputStream out=response.getOutputStream();
		while((len=in.read(buffer))>0){ //从输入流中读取一定数量的字节，并将其存储在缓冲区数组 buffer中。以整数形式返回实际读取的字节数
			out.write(buffer,0,len);
		}
		
		
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
