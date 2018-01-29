<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="/gacl"  prefix="xdp"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'mytag.jsp' starting page</title>
    
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
  <xdp:myItem>循环我吧</xdp:myItem>
  
  <hr/>
    试试有不有ip:<xdp:viewIP/>
    <hr/>
    <!-- 看看是否跳过标签体 -->
    看看哈哈  : <xdp:Play>显示我吗</xdp:Play>
    		<h1>我在后面哦哦哦o</h1>
    		
    		
  </body>
</html>
