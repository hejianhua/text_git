<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'grammarJSP.jsp' starting page</title>
    
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
   
   <!--  一些jsp声明的理解
   	在jsp页面写java代码。
    -->
   <!-- 以下是jsp脚本片段 ，我写一个for循环-->
   <% 
   		for(int i=0;i<10;i++){
   %>
   	<!-- 这里是jsp表达式，用于输出到客户端 ,注意只能输出变量或者表达式-->
   	<%="哈哈哈，能输出看到我吗？----"+i+"<br/>"%>
   	<%
   		}
   	%>
   
   <!-- 注意一下JSP声明 ,jsp声明会把声明的变量提到外面，面层servlet的成员变量或者方法-->
   
   <%!
    	int i=1009;
	public  int aaa(){
		  return i;
	  }
   %>
   <%=aaa()

  
   %>
   <%
   
   	out.print(aaa());
   %>
   
  </body>
</html>
