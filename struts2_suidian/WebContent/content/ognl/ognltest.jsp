<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>ognl访问对象方法</h2>
	<s:property value="'1232hfjkssdkf'.length()"/>
	<h2>ognl访问类的静态方法</h2>
	<!-- 默认关闭，需要配置常量开启 -->
	<s:property value="@java.lang.Math@random()"/>
</body>
</html>