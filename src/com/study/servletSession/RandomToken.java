package com.study.servletSession;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import com.sun.mail.util.BASE64EncoderStream;

public class RandomToken {

	//单例设计模式 。保证类的对象在内存中只有一个
	/** 1.把类的构造函数私有化
	 * 	2.自己创建一个类的对象
	 *  3. 对外提供一个公共的方法，返回类对象
	 *  */
	
	private RandomToken(){
		
	}
	private static final RandomToken to=new RandomToken();
	
	//返回类对象
	public static RandomToken getRandomToken(){
			return to;
	}
	
	
	public  String getRandom(){
		Random r = new Random();
		
		String token = (System.currentTimeMillis()+r.nextInt(999999999))+"";
		
		try {
			MessageDigest md= MessageDigest.getInstance("md5");
			byte [] md5 =md.digest(token.getBytes());
			
			BASE64Encoder   encoder = new BASE64Encoder();
			
			 return encoder.encode(md5);
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
		
	}
	
}
