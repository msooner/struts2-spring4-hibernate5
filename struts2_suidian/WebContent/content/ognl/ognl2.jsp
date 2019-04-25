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
	<s:debug></s:debug>
	<!-- 获取值栈root中的数据 -->
	<s:property value="list[0].name"/>
	<s:property value="list[0].age"/>
	<s:property value="list[1].name"/>
	<s:property value="list[1].age"/>
	<s:property value="list[2].name"/>
	<s:property value="list[2].age"/>
	
	<!-- 获取值栈context中的数据 -->
	<s:property value="#request.name"/>
	<s:property value="#session.name"/>
	<s:property value="#application.name"/>
</body>
</html>