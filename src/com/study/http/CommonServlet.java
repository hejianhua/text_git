package com.study.http;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.zip.GZIPOutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CommonServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			//压缩数据。
			// 设置响应头， content-Encoding告诉浏览器，服务器发送回来的数据压缩后的格式
			String data="aaaaaaaabbbbbbbbbbbvvvvvvvvvvvvvcccccc"+
						 "aaaaaaaaaaaabbbbbbbbsdddddddddddddddddf"+
						 "dfsfdsfsjdkfhsdkjfh dskjf kdsh dskh skh gsdh ";
			System.out.println("看看数据的大小"+data.getBytes().length);
			ByteArrayOutputStream bout=new ByteArrayOutputStream();
			GZIPOutputStream gout=new GZIPOutputStream(bout);
			gout.write(data.getBytes());
			gout.close();
			byte[] g = bout.toByteArray();
			response.setHeader("Content-Encoding", "gzip");
			response.setHeader("Content-Length", g.length+"");
			response.getOutputStream().write(g);
			//System.out.println(new File("\\").getAbsolutePath());
			
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

				this.doGet(request, response);
	}

}
