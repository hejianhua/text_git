<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
  


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>我要测试page，errorPage</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>

  <body>
 <!-- page指令的了解 
 
 	一般来说用于，输出流的缓存。 错误页面， import导入， 设置编码，按照习惯写在开头
 -->
 <%@ page contentType="text/html; charset=utf-8" %>
 <%@ page import="java.util.Date" %> 
 
 <!-- 用  errorPage ,指明出错后跳转的错误页面 
 
 注意的是， /代表的是项目里面， 专业一点叫做 当前项目下根目录  ，因为这个算是服务器-->
 
  <%@ page  errorPage="/ErrorPage/error.jsp" %>

 <%
 
 int a=100/0;
 %>

 
 
 
 
  </body>
</html>
