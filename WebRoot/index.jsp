<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  
  <body>
  	<form action="${pageContext.request.contextPath}/ServletRequestDemo2" method="get"  >
  		用户：<input type="text" name="username"value=""><br>
    	密码：<input type="password" name="password" value=""><br>
    	部门：<select name="dept">
    		<option value="我是搞技术的" selected="selected">技术部</option>
    		<option value="我是搞运营的">运营部</option>
    		<option value="我是搞销售的">销售部</option>
    		<option value="我是搞人事的">人事部</option>
    	</select><br>
    	自己写：<textarea name="random" rows="10" cols="20"></textarea>
    	性别：<input type="radio" name="sex" value="男" checked="checked">男
    	<input type="radio" name="sex" value="女">女<br>
  
  
 		兴趣：<input type="checkbox" name="inst" value="唱歌">唱歌
     	<input type="checkbox" name="inst" value="游泳">游泳 
     	<input type="checkbox" name="inst" value="跳舞">跳舞 
   		<input type="checkbox" name="inst" value="编程" checked>编程 
   		<input type="checkbox" name="inst" value="上网">上网
   		<br>
   		 <input type="hidden" name="hiddenValue" value="我是隐藏的。阿拉啦啦啦"/>
   		 <input type="submit" value="提交(提交按钮)">
    </form>
    
  </body>
</html>
