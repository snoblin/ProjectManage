<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>科研项目信息管理系统</title>
</head>
<link type="text/css" rel="stylesheet" href="css/mainframe.css">
<script src="js/mainframe.js"  type="text/javascript"></script>
<body>
	<!-- 标题 -->
	<div class="biaotititle">
		<h1 class="biaoti">科研项目信息管理系统</h1>
	</div>
	<!-- 左侧导航栏 -->
	<div class="left">
	<ul>
		<li><input class="button1" type="button" value="项目录入" onclick="chageInsert()"/></li>
		<li><input class="button2" type="button" value="项目查看" onclick="chageSelect()"/></li>
		<li><input class="button3" type="button" value="项目修改或删除" onclick="chageUpdate()"/></li>
	</ul>
	<c:if test="${loginUser.power==1}" var="isVip" scope="session">
		<ul>
			<li>
				<input class="button4" type="button" value="项目审核" onclick="chageShenghe()"/>
			</li>
			<li>
				<input class="button5" type="button" value="项目统计" onclick="chageTongji()"/>
			</li>
		</ul>
	</c:if>
	</div>
	<!--主要内容 -->
	<div id="main" class="main">
		<iframe width="1375px" height="600px" id="ifrmname" name="ifrmname" src="jsps/View.jsp"></iframe>
	</div>
</body>
</html>