<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首页</title>
</head>
<body>
	<form method="post" action="add_customer">
		<label>
			ID：<input type="text" name="id" placeholder="请输入ID" required="required">
		</label>
		<label>
			name:<input type="text" name="name" placeholder="请输入姓名" required="required">
		</label>
		<input type="submit" value="提交">
	</form>
</body>
</html>