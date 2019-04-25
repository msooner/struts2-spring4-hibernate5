<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 完全解耦和的方式访问servlet -->
	<h1>完全解耦和的方式访问servlet</h1>
	${ reqname }<br/>
	${ sesname }<br/>
	${ appname }<br/>
	<hr>
	
	<h1>原生的方式访问servlet</h1>
	${ reqName }<br/>
	${ sessName }<br/>
	${ appName }<br/>
</body>
</html>