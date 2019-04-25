<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>增删改查</title>
</head>
<body>
	<!-- 直接配置method方式 -->
	<a href="${ pageContext.request.contextPath }/findUser">查询</a>
	<a href="${ pageContext.request.contextPath }/addUser">增加</a>
	<a href="${ pageContext.request.contextPath }/deleteUser">删除</a>
	<a href="${ pageContext.request.contextPath }/updateUser">更新</a>
	
	<br />
	<br />
	
	<!-- 通配符方式一 -->
	<a href="${ pageContext.request.contextPath }/find_User">查询</a>
	<a href="${ pageContext.request.contextPath }/add_User">增加</a>
	<a href="${ pageContext.request.contextPath }/delete_User">删除</a>
	<a href="${ pageContext.request.contextPath }/update_User">更新</a>
	
	<br />
	<br />
	<!-- 通配符方式 二-->
	<a href="${ pageContext.request.contextPath }/find-curdAction">查询</a>
	<a href="${ pageContext.request.contextPath }/add-curdAction">增加</a>
	<a href="${ pageContext.request.contextPath }/delete-curdAction">删除</a>
	<a href="${ pageContext.request.contextPath }/update-curdAction">更新</a>
	
	<br />
	<br />
	<!-- 动态方式 二-->
	<a href="${ pageContext.request.contextPath }/curd!find">查询</a>
	<a href="${ pageContext.request.contextPath }/curd!add">增加</a>
	<a href="${ pageContext.request.contextPath }/curd!delete">删除</a>
	<a href="${ pageContext.request.contextPath }/curd!update">更新</a>
</body>
</html>