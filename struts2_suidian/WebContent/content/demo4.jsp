<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>属性驱动方式，提供set方法</h3>
	<s:fielderror/>
	<form action="${ pageContext.request.contextPath }/sub1-demo4" method="post">
		姓名：<input type="text" name="name"><br/>
		密码：<input type="password" name="password"><br>
		年龄：<input type="text" name="age"><br>
		<input type="submit" value="提交">
	</form>
	
	<hr>
	<h3>属性驱动方式，页面提供表达式</h3>
	<form action="${ pageContext.request.contextPath }/sub2-demo4" method="post">
		姓名：<input type="text" name="user.name"><br/>
		密码：<input type="password" name="user.password"><br>
		年龄：<input type="text" name="user.age"><br>
		<input type="submit" value="提交">
	</form>
	<hr>
	<h3>模型驱动方式</h3>
	<form action="${ pageContext.request.contextPath }/sub3-demo4" method="post">
		姓名：<input type="text" name="name"><br/>
		密码：<input type="password" name="password"><br>
		年龄：<input type="text" name="age"><br>
		<input type="submit" value="提交">
	</form>
</body>
</html>