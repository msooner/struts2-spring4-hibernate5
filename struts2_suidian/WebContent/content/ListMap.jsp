<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>封装到list中</h1>
	<form action="${ pageContext.request.contextPath }/sub4-demo4">
		姓名：<input type="text" name="list[0].name"><br/>
		密码：<input type="password" name="list[0].password"><br>
		年龄：<input type="text" name="list[0].age"><br>
		姓名：<input type="text" name="list[1].name"><br/>
		密码：<input type="password" name="list[1].password"><br>
		年龄：<input type="text" name="list[1].age"><br>
		<input type="submit" value="提交">
	</form>
	<hr>
	<h1>封装到Map中</h1>
	<form action="${ pageContext.request.contextPath }/sub5-demo4">
		姓名：<input type="text" name="map['0'].name"><br/>
		密码：<input type="password" name="list['0'].password"><br>
		年龄：<input type="text" name="list['0'].age"><br>
		姓名：<input type="text" name="map['1'].name"><br/>
		密码：<input type="password" name="list['1'].password"><br>
		年龄：<input type="text" name="list['1'].age"><br>
		<input type="submit" value="提交">
	</form>
</body>
</html>