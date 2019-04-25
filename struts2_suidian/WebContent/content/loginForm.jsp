<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登陆页面</title>
</head>
<body>
	<form action="login" method="post">
		<table>
			<caption><h3>用户登陆</h3></caption>
			<tr>
				<td>用户名：<input type="text" name="username"/></td>
			</tr>
			<tr>
				<td>密&nqsp;&nqsp;码：<input type="text" name="userpwd"/></td>
			</tr>
			<tr align="center">
				<td colspan="2"><input type="submit" value="登陆"/>
				<input type="reset" value="重填"/></td>
			</tr>
		</table>
	</form>
</body>
</html>