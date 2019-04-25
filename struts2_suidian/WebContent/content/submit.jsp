<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>完全解耦和的方式访问servlet</h1>
	<form action="sub" method="post">
		<label>姓名：<input type="text" required="required" name="username"></label>
		<label>密码：<input type="password" name="userpwd" required="required"></label>
		<input type="submit" autofocus="autofocus" value="提交">
	</form>
	<hr />
	<h1>原生的方式访问servlet</h1>
	<form action="sub1" method="post">
		<label>姓名：<input type="text" required="required" name="username"></label>
		<label>密码：<input type="password" name="userpwd" required="required"></label>
		<input type="submit" autofocus="autofocus" value="提交">
	</form>
</body>
</html>