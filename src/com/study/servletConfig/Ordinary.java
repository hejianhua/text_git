package com.study.servletConfig;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Ordinary {
		
	//例如我想获取到db1 
	
	public static void getFilePath() throws Exception{
		File file=new File("WEB-IF/class/db1.properties"); //这样是不行的，因为会到C盘下面去。
		System.out.println(file.getAbsolutePath());
		InputStream in=new FileInputStream(file);
		Properties pro= new Properties();
		pro.load(in);
		String ppp= pro.getProperty("ppp");
		System.out.println(ppp);
	}
	
	//用类加载的，靠谱
	
	public static void getLoardPath(){
		ClassLoader loader = Ordinary.class.getClassLoader();
		//获取一下 db1			
		InputStream inputStream = loader.getResourceAsStream("db1.properties");
		Properties prop = new Properties();
		try {
			prop.load(inputStream);
			String value = prop.getProperty("ppp");
			System.out.println(value);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	//再来读取一下bd4
	public static void readDB4(){
		ClassLoader loader = Ordinary.class.getClassLoader();
		//获取一下 db1			
		InputStream inputStream = loader.getResourceAsStream("com/study/servletConfig/db4.properties");
		Properties prop = new Properties();
		try {
			prop.load(inputStream);
			String value = prop.getProperty("qqq");
			System.out.println(value);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	//读一下db2
	public static void readDB2(){
		ClassLoader loader = Ordinary.class.getClassLoader();
		//获取一下 db1			
		InputStream inputStream = loader.getResourceAsStream("../../db2.properties");
		Properties prop = new Properties();
		try {
			prop.load(inputStream);
			String value = prop.getProperty("name");
			System.out.println(value);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
