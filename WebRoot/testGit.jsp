<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'testGit.jsp' starting page</title>
    
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
   		<span>我就是来写一点东西，然后测试git的。</span>
   		哈哈哈，我又加了一点东西。哈哈哈按时打算
   		
   		ooo ooooooooo
   		111111111  我再想啊，如何搞点冲突过来111
   		2222222222222
   		3333333333333
   		------------------------------
   		
   		我在本地创建了一个分支，然后我现在在localdev01上面修改
   		2222222222222
   		33333333333333
   		
  </body>
</html>
